import React from 'react'

function MemoComponent({name}) {
    console.log("Memo Component.." + name)
    return (
        <div>
            {name}
        </div>
)
}

export default React.memo(MemoComponent);