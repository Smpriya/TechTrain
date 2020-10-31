import React, { Component } from 'react'
import RegularComp from './RegularComp';
import PureComp from './PureComponent';
import MemoComponent from './MemoComponent';

class NewParentComponent extends Component {

    constructor(props) {
        super(props)
    
        this.state = {
             name : 'Sivakumar'
        }
    }

    componentDidMount(){
        setInterval(()=>{
            this.setState({
                name : 'Sivakumar'
            })
        },4000);
    }
    


    render() {
        console.log("***************** New Parent Component *****************");
        return (
            <div>
                Parent Component
                <RegularComp name={this.state.name}></RegularComp>
                <PureComp name={this.state.name}></PureComp>
                <MemoComponent name={this.state.name}></MemoComponent>
            </div>
        )
    }
}

export default NewParentComponent
