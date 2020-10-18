import React, { Component } from 'react';

class Welcome extends Component {
    render(){
        return <p>I am from Class Component:- {this.props.name} a.k.a {this.props.address}</p>;
    }
}

export default Welcome;