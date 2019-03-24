import React from 'react';
import './Assignment1.css'

const Assignment = (props) => {

    return (
        <div className="Assignment">
            <p>Hi, My name is {props.name}</p>
            <p>No pain no gain {props.age}</p>
        </div>
    )

}

export default Assignment;