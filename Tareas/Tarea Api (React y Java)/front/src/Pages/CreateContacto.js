import axios from 'axios';
import React, { useState } from 'react'
import { useNavigate } from 'react-router-dom';

export default function CreateContact () {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const navigate = useNavigate();

  const handleSubmit = (e) => {
    e.preventDefault();
    axios.post('http://localhost:9090/contacts', {
      nombre: name,
      email,
    }).then(res => navigate('/')).catch(err => console.log(err));
  }

  return (
    <form
      onSubmit={handleSubmit}>
      <label>
        Nombre:
        <input
          value={name}
          onChange={(e) => setName(e.target.value)}
          type="text" name="name" />
      </label>
      <label>
        Email:
        <input
          value={email}
          onChange={(e) => setEmail(e.target.value)}
          type="text" name="email" />
      </label>
      <input type="submit" value="Submit" />
    </form>
  )
}
