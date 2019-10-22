package com.example.aadcontactos;

public class Contacto {
    private Long Id;
    private String nombre;
    private String numero;

    public Contacto(Long id, String nombre, String numero) {
        this.Id = id;
        this.nombre = nombre;
        this.numero = numero;
    }
    public Contacto(){

    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNumero() {
        return numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
