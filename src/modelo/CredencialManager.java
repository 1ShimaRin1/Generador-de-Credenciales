/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author ShimaRin
 */
import java.util.ArrayList;

public class CredencialManager {
    private static CredencialManager instancia;
    private final ArrayList<Credencial> lista;

    private CredencialManager() {
        lista = new ArrayList<>();
    }

    public static CredencialManager getInstancia() {
        if (instancia == null) {
            instancia = new CredencialManager();
        }
        return instancia;
    }

    public void agregar(Credencial c) {
        lista.add(c);
    }

    public void listar() {
        for (Credencial c : lista) {
            c.mostrar();
        }
    }

    public void generarTodas() {
    for (Credencial c : lista) {
        c.mostrar();
    }
}
}
