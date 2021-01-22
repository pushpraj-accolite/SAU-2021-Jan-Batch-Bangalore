import React, { useState, useEffect } from "react";
import { View, TextInput, Text} from "react-native";
import AsyncStorage from '@react-native-community/async-storage';
import Button from "./Button";

const Login = ({ navigation }) => {
    const [userName, setUserName] = useState("");
    const checkAuth = async () => {
        // await AsyncStorage.removeItem("userName");
        const user = await AsyncStorage.getItem("userName");
        if (user) {
            navigation.reset({
                index: 0,
                routes: [{ name: "view-notes" }],
            });
        }
        return;
    }
    useEffect(() => {
        checkAuth();
    }, []);
    const login = async () => {
        await AsyncStorage.setItem("userName", userName);
        navigation.reset({
            index: 0,
            routes: [{ name: "view-notes" }],
        });
    }
    return (
        <View style={{height:"100%",width:"100%",justifyContent:"center",padding:40}}>
            <TextInput placeholder="username" style={{borderColor: "green",borderWidth: 1,borderRadius: 5,fontSize: 18,padding: 4,width: "90%",marginBottom: 20,}} onChangeText={(text) => setUserName(text)} />
            <Button title="Login" action={login} />
        </View>
    )
}
export default Login;
