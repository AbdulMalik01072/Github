import React from 'react';
import './App.css';
import Navbar from './components/Navbar';
import AddEmployee from './components/AddEmployee';
import { BrowserRouter, Route } from 'react-router-dom';
import EmployeeList from './components/EmployeeList';

function App() {
  return(
  <>
  <BrowserRouter>
  <Navbar/>
    <Route>
    <Route index element={<EmployeeList/>} />
    <Route path="/" element={<EmployeeList/>}></Route>
    <Route path="/employeeList" element={<EmployeeList />} />
    <Route path="/addEmployee" element={<AddEmployee />} />
    </Route>
    <AddEmployee/>
    <EmployeeList/>
  </BrowserRouter>
</>
  );
}

export default App;
