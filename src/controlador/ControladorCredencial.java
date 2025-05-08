/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;
import modelo.CredencialEvento;
import modelo.CredencialManager;
import java.util.Scanner;
/**
 *
 * @author ShimaRin
 */
public class ControladorCredencial {

    public static void agregarDesdeConsola(Scanner sc) {
        System.out.print("Nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Cargo: ");
        String cargo = sc.nextLine();
        System.out.print("RUT: ");
        String rut = sc.nextLine();

        CredencialEvento plantilla = new CredencialEvento();
        CredencialEvento clon = (CredencialEvento) plantilla.clonar();
        clon.setDatos(nombre, cargo, rut);
        CredencialManager.getInstancia().agregar(clon);
    }

    public static void generar() {
    CredencialManager.getInstancia().generarTodas();
}
}

