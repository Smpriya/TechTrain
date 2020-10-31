import React, { Component } from 'react'
import FwdRefInput from './FwdRefInput'

class FwdRefParent extends Component {
    constructor(props) {
        super(props)
        this.inputRef = React.createRef();
    }

    handler = () => {
        this.inputRef.current.focus();
    }

    render() {
        return (
            <div>
                <FwdRefInput ref={this.inputRef} />
                <button onClick={this.handler}>FocusInput</button>
            </div>
        )
    }
}

export default FwdRefParent
