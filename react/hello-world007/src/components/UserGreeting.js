import React, { Component } from 'react'

class UserGreeting extends Component {

    constructor(props) {
        super(props)

        this.state = {
            isLoggedIn: false,
            isSuperSubbu: false
        }
    }


    render() {

        let message;

        if (this.state.isLoggedIn){
            message = <div>Welcome SuperSubbu</div>
        } else {
            message = <div>Welcome Guest</div>
        }


        // if (this.state.isLoggedIn) {
        //     return (
        //         <div>
        //             Welcome SuperSubbu
        //         </div>
        //     )
        // } else {
        //     return (
        //         <div>
        //             Welcome Guest
        //         </div>
        //     )
        // }



        //  return (
        //      <div>
        //          {message}
        //      </div>
        //  )

        // return this.state.isLoggingIn && <div>Welcome SuperSubbu</div>;

        return (
            this.state.isLoggedIn ? <div>Welcome SuperSubbu</div> : <div>Welcome Guest</div>
        )
    }
}

export default UserGreeting
