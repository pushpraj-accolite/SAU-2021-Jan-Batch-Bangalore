import React from "react";
import { TouchableOpacity, Text} from "react-native";
const Button = ({ title, action }) => {
    return (
        <TouchableOpacity style={{padding: 5,margin: 3,width:"30%",height:35,backgroundColor:"green",borderRadius:20}} onPress={action}>
            <Text style={{fontWeight: "bold",textAlign: "center",color:"white",fontSize:20}}> {title}</Text>
        </TouchableOpacity>
    );
}
export default Button;
