import React, { useEffect, useState } from "react";
import { View, ScrollView, Text} from "react-native";
import AsyncStorage from '@react-native-community/async-storage';
import { useIsFocused } from "@react-navigation/native";
import Button from "./Button";
import { NoteCard } from "../../../components/index";

const ViewNotes = ({ navigation }) => {
    const isFocused = useIsFocused();
    const [notesList, setNotesList] = useState([]);
    const addNotes = () => {
        navigation.navigate("add-notes");
    }
    const fetchNotes = async () => {
        var notes = await AsyncStorage.getItem("notesList");
        if (notes !== null) {
            notes = JSON.parse(notes);
        }
        setNotesList(notes);
    }
    useEffect(() => {
        fetchNotes();
    }, [isFocused])

    return (
        <View style={{flex:1,height:"100%"}}>
        { 
            <ScrollView style={{marginBottom:30}}>
                {(notesList.map((el, idx) => <NoteCard id={idx} noteData={el} navigation={navigation}/>))}
            </ScrollView>
        }
            <View style={{flex: 1,justifyContent: 'flex-end'}}>
                <Button action={addNotes} />     
            </View>
        </View>
    );
}
export default ViewNotes;

