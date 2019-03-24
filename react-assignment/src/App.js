import React, { Component } from 'react';
import './App.css';
import Ass from './Assignment/Assignment1';
import Output from './Assignment/Assignment1.1';

class App extends Component {

  state = {
    username : [
      {name: "Tehkesih2", age: 20},
      {name: "Windy", age: 21},
      {name: "Suwarno", age: 22}
    ]
  }

  manipulateChange = (event) => {

    this.setState({
      username : [
        {name: "Tehkesih2", age: 20},
        {name: event.target.value, age: 21},
        {name: "Suwarno", age: 22}
      ] }
    )
  }

  clickMe = (testing) => {
    this.setState({
      username : [
        {name: testing, age: 22},
        {name: "Windy", age: 21},
        {name: "Tehkesih", age: 20}
      ] }
    )

  }

  render() {

    const makeup = {
      backgroundColor: 'FF1122',
      width: '60%',
      padding: '20px'
    }
    return (
      <div className="App">
        <p>My name is Tehkesih and I gonna be a REACT expert in 1 month hwhaaha</p>
        <p>I love Securemetric</p>
        <p>Just Kidding tho</p>
        <button style={makeup}
              onClick={this.clickMe.bind(this,'FUFUFUFU')}>Click me to change one of the value.</button>
        <br/>
        <br/>
        <Output click={this.manipulateChange}/>
        <Ass name={this.state.username[0].name}
              age={this.state.username[0].age}/>
        <Ass name={this.state.username[1].name}
             age={this.state.username[1].age}
             />
        <Ass name={this.state.username[2].name}
             age={this.state.username[2].age}/>
      </div>
    );
  }
}

export default App;
