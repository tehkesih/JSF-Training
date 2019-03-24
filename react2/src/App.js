import React, { Component } from 'react';
import './App.css';
import Person from './Person/Person';

class App extends Component {

  state = {
   persons: [
     {name: 'Max', age: 28},
     {name: 'Windy', age: 20},
     {name: 'Suwarno', age: 22}
   ]
  }

  switchButton = (newName) => {

    this.setState( {
      persons: [
        {name: newName, age: 28},
        {name: 'Windy', age: 20},
        {name: 'Suwarno', age: 22}
      ]
    })
  }

  nameChangedHandler = (event) => {

    this.setState( {
      persons: [
        {name: 'Max', age: 28},
        {name: event.target.value, age: 20},
        {name: 'Suwarno', age: 22}
      ]
    })
  }


  render(){
      const style = {
          backgroundColor: 'white',
          font: 'inherit',
          border: '1px solid blue',
          padding: '9px',
          cursor: 'pointer'
      };

    return (
        <div className="App">
          <p>This is Tehkesih Testing something</p>
          <p>Gonna Send something to the person.js</p>
          <button
              style={style}
              onClick={this.switchButton.bind(this,'HohoHaha')} >
              CLick here to change something tho
          </button>
          <Person
            name= {this.state.persons[0].name}
            age= {this.state.persons[0].age}/>
          <Person
              name= {this.state.persons[1].name}
              age= {this.state.persons[1].age}
              click={this.switchButton.bind(this,'REACT')}
              changed={this.nameChangedHandler}>I Love Fishing</Person>
          <Person
              name= {this.state.persons[2].name}
              age= {this.state.persons[2].age}/>
        </div>

    );

  }

}

export default App;