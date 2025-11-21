/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectojuevesnocheg0.ModuloClientes;

/**
 *
 * @author bryan
 */
public class Clientes {
    private String identififacion;
    private String nombre;

    public Clientes() {
    }

    
    public Clientes(String identififacion, String nombre) {
        this.identififacion = identififacion;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentififacion() {
        return identififacion;
    }

    public void setIdentififacion(String identififacion) {
        this.identififacion = identififacion;
    }

    @Override
    public String toString() {
        return "Clientes{" + "identififacion=" + identififacion + ", nombre=" + nombre + '}';
    }
    
    
    
}
