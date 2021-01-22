import React from "react";
import { TouchableOpacity, View, Text } from "react-native";
import AsyncStorage from '@react-native-community/async-storage';

const NoteCard = ({ noteData, navigation }) => {

    const deleteCard = async (id) => {
        let currentList = JSON.parse(await AsyncStorage.getItem("notesList"));
        for (var i in currentList) {
            if (currentList[i].id == id) {
                currentList.splice(parseInt(i), 1);
            }
        }
        await AsyncStorage.setItem("notesList", JSON.stringify(currentList));
        currentList = JSON.parse(await AsyncStorage.getItem("notesList"));
        navigation.reset({
            index: 0,
            routes: [{ name: "view-notes" }],
        });
    }
    return (
        <View style={{borderWidth:1,margin:15,borderRadius:15,borderColor:"green"}}>
            <TouchableOpacity>
                <Text style={{fontSize: 30,color: "black",fontWeight: "400",padding: 5,}}> {noteData.note.title} </Text>
            </TouchableOpacity>
            <Text style={{fontSize: 20, paddingLeft:40}}> {noteData.note.content} </Text>
            <TouchableOpacity onPress={() => deleteCard(noteData.id)} style={{width: '30%',fontSize: 16,borderWidth: 3,borderColor: "#20232a",borderRadius: 6,backgroundColor: "#61dafb",color: "#20232a",textAlign: "center",margin:10}}>
                    <Text style={{ color: "red", fontWeight: "bold",textAlign:"center",fontSize:16}}> DELETE</Text>
            </TouchableOpacity>
        </View>
    );
}
export default NoteCard;


