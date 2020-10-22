import React from 'react'

const heading = {
    fontSize : '82px',
    color: 'blue'
}

function InLine() {
    return (
        <div>
            <h1 style={heading}>Inline</h1>
            <h1 className='error'>Inline Error Data</h1>
        </div>
    )
}

export default InLine
