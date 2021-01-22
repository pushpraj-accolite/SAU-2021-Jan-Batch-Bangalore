import React from "react";
import { TouchableOpacity, Text} from "react-native";
import { Dimensions } from 'react-native';
const Button = ({ title, action }) => {
    return (
        <TouchableOpacity style={{padding: 5,margin: 3,borderColor: "green",borderWidth: 3,width: Dimensions.get('window').width * 0.2,}} onPress={action}>
            <Text style={{color: "green",fontWeight: "bold",textAlign: "center"}}> {title}</Text>
        </TouchableOpacity>
    );
}
export default Button;
