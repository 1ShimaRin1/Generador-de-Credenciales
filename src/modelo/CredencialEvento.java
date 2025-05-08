/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ShimaRin
 */
public class CredencialEvento extends Credencial {

    @Override
    public Credencial clonar() {
        CredencialEvento copia = new CredencialEvento();
        copia.setDatos(this.nombre, this.cargo, this.rut);
        return copia;
    }

    public void generarImagen(String salida) {
        // Aquí podrías integrar alguna librería Java para imágenes (como Java AWT/Swing si deseas exportar).
        System.out.println("Generando credencial para: " + nombre);
    }
    
    public void mostrar() {
    System.out.println("---- Credencial Generada ----");
    System.out.println("Nombre: " + nombre);
    System.out.println("Cargo: " + cargo);
    System.out.println("RUT: " + rut);
    System.out.println("-----------------------------");
}
}


