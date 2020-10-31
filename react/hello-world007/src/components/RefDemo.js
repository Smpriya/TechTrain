import React, { Component } from 'react'

class RefDemo extends Component {

    constructor(props) {
        super(props)
        this.inputRef = React.createRef();
        
        //Older Approach
        this.callbackRef = null;
        this.setCallbackRef = (element)=>{
            this.callbackRef = element;
        }
    }

    componentDidMount(){
        console.log(this.inputRef);
        this.inputRef.current.focus();


        if (this.callbackRef){
            this.callbackRef.focus();
        }
    }

    clickEventHandler = () => {
        alert(this.inputRef.current.value);
    }


    render() {
        return (
            <div>
                <input type="text" ref={this.inputRef}/>
                <input type="text" ref={this.setCallbackRef}/>
                <button onClick={this.clickEventHandler}>Click</button>
            </div>
        )
    }
}

export default RefDemo
