import React from 'react';

// function Greet(){
//     return <h1>Hello React</h1>;
// }
//named export
//export const Greet = () => <h1>Hello Arrow React</h1>; 

const DeStruct1 = ({name,address}) => {
    console.log(name + "," + address);
    return (
        <div>
            <h1>Hello {name} a.k.a {address}</h1>
        </div>
    );
}
export default DeStruct1