import React from 'react'

// function FwdRefInput() {
//     return (
//         <div>
//             <input type='text'/>
//         </div>
//     )
// }

const FwdRefInput = React.forwardRef((props,ref) => {
    return (
        <div>
            <input type='text' ref={ref}/>
        </div>
    );
});




export default FwdRefInput
