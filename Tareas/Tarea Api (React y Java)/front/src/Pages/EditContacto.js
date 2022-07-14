import axios from 'axios';
import React, { useState, useEffect } from 'react'
import {Link, useNavigate, useParams } from 'react-router-dom';

export default function EditContacto() {
    const [contactos, setContactos] = useState([]);
    let { id } = useParams();
    const navigate = useNavigate();

    
    useEffect(() => {
        axios.get(`http://localhost:9090/contacts/${id}`)
            .then(res => {
                console.log(res.data);
                setContactos(res.data)}
                )
            .catch(err => console.log(err));
    }, [id]);

    const handleFormSubmit = (e) => {
        e.preventDefault();

        axios.put(`http://localhost:9090/contacts/${id} `, contactos)
            .then(res => navigate('/'))
            .catch(err => console.log(err));
            
    }

  return (
    <div>
        <h1>Editar Contacto</h1>
        <form
        onSubmit={handleFormSubmit}
        >
            <div className="form-group">
                <label>Nombre</label>
                <input type="text" className="form-control" value={contactos.nombre} 
                onChange={(e) => setContactos({...contactos, nombre: e.target.value})}
                />
                <label>Telefono</label>
                <input type="text" className="form-control" value={contactos.email} 
                onChange={(e) => setContactos({...contactos, email: e.target.value})}
                />
            </div>
            <button type="submit" className="btn btn-primary">Guardar</button>
            <button><Link to={-1}>Go back</Link></button>
        </form>
    </div>
  )
}
