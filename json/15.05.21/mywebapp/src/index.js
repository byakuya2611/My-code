import React from 'react';
import ReactDOM from 'react-dom';
// import './index.css';
// import App from './App';
import QiuzScreen from './screens/QiuzScreen'
import reportWebVitals from './reportWebVitals'
// let questions = require('./data/fakeData')
ReactDOM.render(
  <React.StrictMode>
    <QiuzScreen />
  </React.StrictMode>,
  document.getElementById('root')
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
