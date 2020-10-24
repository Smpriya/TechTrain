import React, { Component } from 'react'
import LifeCycleB from './LifeCycleB';

class LifeCycleA extends Component {

    constructor(props) {
        super(props)

        this.state = {
            name: 'siva'
        }
        console.log("1.....LifeCycleA Constructor....");
    }

    static getDerivedStateFromProps(props, state) {
        console.log("2.....LifeCycleA getDerivedStateFromProps()....");
        return null;
    }

    componentDidMount() {
        console.log("4.....LifeCycleA componentDidMount()....");
    }


    render() {
        console.log("3.....LifeCycleA render()....");
        return (
            <div>
                <LifeCycleB></LifeCycleB>
                <h1>Life Cyecle</h1>
            </div>
        )
    }
}

export default LifeCycleA
