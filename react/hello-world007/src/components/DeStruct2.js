import React from 'react';

// function Greet(){
//     return <h1>Hello React</h1>;
// }
//named export
//export const Greet = () => <h1>Hello Arrow React</h1>; 

const DeStruct2 = (props) => {
    const {name,address,children}  = props;
    console.log(name + "," + address);
    return (
        <div>
            <h1>Hello {name} a.k.a {address}</h1>
            {children}
        </div>
    );
}
export default DeStruct2