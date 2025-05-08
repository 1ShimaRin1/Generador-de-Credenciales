/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;
import controlador.ControladorCredencial;
import java.util.Scanner;
/**
 *
 * @author ShimaRin
 */
public class Consola {
    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Generar una Credencial");
            System.out.println("2. Ver Credenciales generadas");
            System.out.println("0. Salir");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1 -> ControladorCredencial.agregarDesdeConsola(sc);
                case 2 -> ControladorCredencial.generar();
            }

        } while (opcion != 0);
    }
}

