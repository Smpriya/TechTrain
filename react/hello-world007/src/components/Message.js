import React, { Component } from 'react';

class Message extends Component {
    constructor() {
        super();
        this.state = {
            message: 'Welcome visitor'
        };
    }

    changeMessage() {
        this.setState({
            message : 'Thanks for Subscription'
        });
    }

    render() {
        return (
            <div>
                <p>
                    {this.state.message}
                </p>
                <button onClick={() => this.changeMessage()}>Subscribe</button>
            </div>

        )
    }
}

export default Message;