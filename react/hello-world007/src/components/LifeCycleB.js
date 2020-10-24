import React, { Component } from 'react'

class LifeCycleB extends Component {

    constructor(props) {
        super(props)
    
        this.state = {
            name : 'siva' 
        }
        console.log("1.....LifeCycleB Constructor....");
    }
    
    static getDerivedStateFromProps(props, state){
        console.log("2.....LifeCycleB getDerivedStateFromProps()....");
        return null;
    }

    componentDidMount(){
        console.log("4.....LifeCycleB componentDidMount()....");
    }


    render() {
        console.log("3.....LifeCycleB render()....");
        return (
        <div>
                <h1>Life CyecleB</h1>
            </div>
        )
    }
}

export default LifeCycleB
