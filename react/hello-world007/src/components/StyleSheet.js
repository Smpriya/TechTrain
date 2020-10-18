import React from 'react';
import './myStyles.css';

function StyleSheet(props) {
    let className = props.primary ? 'primary' : '';
    return (
        <div>
            <h1 className={className}>StyleSheets1</h1>            
            <h1 className={`${className} font-xl`}>StyleSheets2</h1>            
        </div>
    )
}

export default StyleSheet
