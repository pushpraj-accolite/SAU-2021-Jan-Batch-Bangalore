import React from "react";
import { TouchableOpacity, Text } from "react-native";

const Button = ({ action }) => {
    return (
        <TouchableOpacity activeOpacity={0.5} style={{position: 'absolute',width: 90,height: 50,alignItems: 'center',justifyContent: 'center',right: 30,bottom: 30,backgroundColor:"green",borderRadius:50}} onPress={action}>
                <Text style={{fontSize:20,color:"white"}}>
                    Add
                </Text>
        </TouchableOpacity>
    );
}
export default Button;
