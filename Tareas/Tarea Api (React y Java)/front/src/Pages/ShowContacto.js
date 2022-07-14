import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { Link, useParams } from 'react-router-dom';

export default function ShowContacto() {
    const [contact, setContact] = useState({});
    const {id} = useParams();
    useEffect(() => {
        axios.get(`http://localhost:9090/contacts/${id}`)
            .then(res => 
                setContact(res.data))
            .catch(err => console.log(err));
    }, [id]);

  return (
    <div>
        <h1>Contacto</h1>
        <div>
            <p>Nombre: {contact.nombre}</p>
            <p>Email: {contact.email}</p>
            <Link to={-1}>Go back</Link>
        </div>
            
    </div>
  )
}
