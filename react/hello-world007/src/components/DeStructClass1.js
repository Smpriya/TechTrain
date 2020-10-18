import React, { Component } from 'react';

class DeStructC1 extends Component {
    render() {
        const {name,address} = this.props;
        //const {a,b,c} = this.state;
        return (
            <p>I am from Class Component:- {name} a.k.a {address}</p>
        );
    }
}

export default DeStructC1;