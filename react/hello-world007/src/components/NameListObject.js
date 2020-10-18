import React from 'react'
import Person from './Person'

export default function NameListObject() {

    const persons = [
        {
            id: 1,
            name: "MarkAntony",
            age: 45,
            skill: "Java"
        },
        {
            id: 2,
            name: "Pattasuu Balu",
            age: 55,
            skill: "C-Sharp"
        },
        {
            id: 3,
            name: "Singaram",
            age: 35,
            skill: "VisualBasic10"
        }
    ]

    const personsList = persons.map((person) => {
        return <Person key={person.id} person={person}></Person>
    })

    console.log(personsList);

    return (
        <div>
            {personsList}
        </div>
    )
}
