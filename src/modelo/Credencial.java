/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ShimaRin
 */
public abstract class Credencial implements Cloneable {
    protected String nombre;
    protected String cargo;
    protected String rut;

    public abstract Credencial clonar();

    public void setDatos(String nombre, String cargo, String rut) {
        this.nombre = nombre;
        this.cargo = cargo;
        this.rut = rut;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre + ", Cargo: " + cargo + ", RUT: " + rut);
    }
}
