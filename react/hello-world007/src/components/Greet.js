import React from 'react';

// function Greet(){
//     return <h1>Hello React</h1>;
// }
//named export
//export const Greet = () => <h1>Hello Arrow React</h1>; 

const Greet = (props) => {
    console.log(props);
    return (
        <div>
            <h1>Hello {props.name} a.k.a {props.address}</h1>
            {props.children}
        </div>
    );
}
export default Greet