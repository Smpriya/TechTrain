import React from 'react';

export const Hello = () => {
    return (
        <div id='Hello' className='dummyClass'>
            <h1>Hi from my 3rd Component</h1>
        </div>
    );
}

export const Hello2 = () => {
    //return React.createElement('div',null,'h1','Hi from 3rd.1 Component');
    return React.createElement(
        'div',
        {id : 'hello',className:'dummyClass'},
        React.createElement(
            'h1',
            null,
            'Hi from 3rd.1 Componmenmt'
        ));
}

//export default Hello;
//export default Hello2;