import React, { Component } from 'react'

export default class ClassClick extends Component {
    
    clickHandler(){
        console.log("Button Clicked in Class");
    }

    render() {
        return (
            <div>
                <button onClick={this.clickHandler}>ClickMe</button>
            </div>
        )
    }
}
