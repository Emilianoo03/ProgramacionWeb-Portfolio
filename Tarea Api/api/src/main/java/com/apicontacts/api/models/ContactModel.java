package com.apicontacts.api.models;

import javax.persistence.*;

@Entity
@Table(name = "contacts")
public class ContactModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false, unique = true)
    private Long id;
    // Es una ID, que se genera automaticamente( y se auto incremente), que no puede ser nulo y es unico.
    
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "email", nullable = false)
    private String email;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    
}
