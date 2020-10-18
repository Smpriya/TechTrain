import React from 'react';
import logo from './logo.svg';
import './App.css';

//import { Greet } from './components/Greet';
import Greet from './components/Greet';
import Welcome from './components/Welcome';
import { Hello , Hello2 } from './components/Hello';
import Message from './components/Message';
import Counter from './components/Counter';
import DeStruct1 from './components/DeStruct1';
import DeStruct2 from './components/DeStruct2';
import DeStructC1 from  './components/DeStructClass1';
import FunctionClick from './components/FunctionClick';
import ClassClick from './components/ClassClick';
import EventBind from './components/EventBind';
import ParentComponent from './components/ParentComponent';
import UserGreeting from './components/UserGreeting';
import NameList from './components/NameList';
import NameListObject from './components/NameListObject';
import StyleSheet from './components/StyleSheet';
    
function App() {
  return (
    <div className="App">
     {/* 
     <Greet/>
     <Welcome></Welcome> 
     https://www.youtube.com/watch?v=j5P9FHiBVNo
     */}
     <Greet name="Isha" address="123 Kam">
      <p>This is my Isha Children</p>
     </Greet>
     <Greet name="Siva" address="321 Kam">
      <button>Submit</button>
     </Greet>
     <Greet name="Sadguru" address="456 Vell"/>
     <Hello></Hello>
     <Hello2></Hello2>
     <Welcome name="Shri Jaggi" address="Brambham"></Welcome>
     <Welcome name="sg" address="Kailash"></Welcome>
     <Welcome name="CBE" address="ShivaTemple"></Welcome>
     <hr></hr>
     <Message></Message>
     <hr></hr>
     <Counter></Counter>
     <hr></hr>
     <DeStruct1 name="TNJR" address="PeruudaiyarTemple"></DeStruct1>
     <DeStruct2 name="TNJR2" address="PeruudaiyarTemple2">
      <p>This is my Isha Center</p>
     </DeStruct2>
     <hr></hr>
     <DeStructC1 name="TNJR3" address="PeruudaiyarTemple3"></DeStructC1>
     <hr></hr>
     <FunctionClick></FunctionClick>
     <hr></hr>
     <ClassClick></ClassClick>
     <hr></hr>
     <EventBind></EventBind>
     <hr></hr>
     <ParentComponent></ParentComponent>
     <hr></hr>
     <UserGreeting></UserGreeting>
     <hr></hr>
     <NameList></NameList>
     <hr></hr>
     <NameListObject></NameListObject>
     <hr></hr>
     <StyleSheet primary={true}></StyleSheet>
    </div>
  );
}

export default App;
