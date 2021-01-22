import React, { useState } from "react";
import { TextInput, View } from "react-native";
import { Dimensions } from 'react-native';
import AsyncStorage from '@react-native-community/async-storage';
import Button from "./Button";

const NewNoteCard = ({ navigation }) => {
    const [noteTitle, setNoteTitle] = useState("");
    const [noteContent, setNoteContent] = useState("");

    const submitNote = async () => {
        var newNote = {
            "title": noteTitle,
            "content": noteContent,
        }
        var notesList = await AsyncStorage.getItem("notesList");
        notesList = JSON.parse(notesList);
        if (notesList === null) {
            notesList = [
                {
                    id: "1",
                    note: newNote,
                }
            ]
        } else {
            let noteId = notesList.length + 1;
            notesList.push(
                {
                    id: noteId,
                    note: newNote,
                }
            )
        }
        await AsyncStorage.setItem('notesList', JSON.stringify(notesList));
        var noteListFetched = await AsyncStorage.getItem('notesList');
        navigation.goBack();
    }
    return (
        <View style={{height: Dimensions.get("window").height * 0.5,width: Dimensions.get('window').width * 0.9,justifyContent: "center",alignSelf: "center"}}>
            <TextInput multiline style={{borderColor: "green",borderWidth: 1,borderRadius: 5,width: "95%",fontSize: 18,fontWeight: "bold",marginVertical: 20,paddingLeft:15}} placeholder="Title" onChangeText={setNoteTitle} />
            <TextInput multiline style={{borderColor: "green",borderWidth: 1,borderRadius: 5,fontSize: 18,padding: 4,width: "95%",height:"60%",marginBottom: 20,}} placeholder="Enter note " onChangeText={setNoteContent} />
            <Button title="ADD" action={submitNote} />
        </View>
    );
}

export default NewNoteCard;
