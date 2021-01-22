import React from 'react';
import { createStackNavigator } from '@react-navigation/stack';
import { NavigationContainer } from "@react-navigation/native";

import { AddNotes, Login, ViewNotes } from './screens/index';

const Stack = createStackNavigator();

export default function App() {
  return (

    <NavigationContainer>
      <Stack.Navigator>
        <Stack.Screen name="login" component={Login}/>
        <Stack.Screen name="view-notes" component={ViewNotes} options={{ title: "Notes" }} />
        <Stack.Screen name="add-notes" component={AddNotes}/>
      </Stack.Navigator>
    </NavigationContainer>
  );
}


