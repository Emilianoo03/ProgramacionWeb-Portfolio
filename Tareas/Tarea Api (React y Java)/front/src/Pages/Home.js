import React, { useEffect, useState } from 'react'
import axios from 'axios';
import { Link } from 'react-router-dom';
const Home = () => {
  const [contacts, setContacts] = useState([]);

  const fetchContacts = async () => {
    const res = await axios.get('http://localhost:9090/contacts');
    setContacts(res.data);
  }

  useEffect(() => {
    fetchContacts();
  }, []);

  const deleteContact = (id) => {
    axios.delete(`http://localhost:9090/contacts/${id}`)
      .then(res => fetchContacts())
      .catch(err => console.log(err));
  }

  return (
    <div>
      <table className="table">
        <thead>
          <tr>
            <th scope="col">id</th>
            <th scope="col">Nombre</th>
            <th scope="col">Email</th>
            <th scope="col">buttons</th>
          </tr>
        </thead>
        <tbody>
          {contacts.map(contact => (
            <tr key={contact.id}>
              <th scope="row">{contact.id}</th>
              <td>{contact.nombre}</td>
              <td>{contact.email}</td>
              <td>
                <Link to={`contactos/show/${contact.id}`}>Show</Link>
                <Link to={`contactos/edit/${contact.id}`}>Edit {contact.id} </Link>
                <button className="btn btn-danger" onClick={() => deleteContact(contact.id)}>Delete</button>
              </td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  )
}

export default Home