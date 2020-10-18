import React, { Component } from 'react'

export class EventBind extends Component {
    constructor(props) {
        super(props)
    
        this.state = {
            message : 'Hello'
        }

        this.clickHandler = this.clickHandler.bind(this);
    }
    
    //3rd Approacb
    clickHandler(){
        this.setState({
            message : "Welcome to React"
        })
        console.log(this);
    }

    //4rth Approach
    clickHandler2 = ()=>{
        this.setState({
            message : "Welcome to React2"
        })
        console.log(this);
    }

    render() {
        return (
            <div>
                <div>{this.state.message}</div>
                {/* <button onClick={this.clickHandler.bind(this)}>Click</button> */}
                {/* <button onClick={()=> this.clickHandler()}>Click</button>  */}
                <button onClick={()=> this.clickHandler()}>Click</button>
                <button onClick={()=> this.clickHandler2()}>Click2</button>
            </div>
        )
    }
}

export default EventBind
