import React from 'react'

function NameList() {
    const names = ['Kala', 'Basha', 'Petai Velan', 'Aditya Arunachalam','Kala'];
const namesList = names.map((name,index) => <h1 key={index}>{index}-{name}</h1>)
    return (
        <div>
            {
//                names.map((name) => {
//                    console.log("=======" + name);
//                    return <h2>{name}</h2>
//                })
                namesList
            }
        </div>
    )
}

export default NameList
