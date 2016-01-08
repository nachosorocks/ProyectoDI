/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author usuario
 */
public class miniCliente {

    private final int codCliente;
    private final String Nombre;

    public miniCliente(int codCliente, String Nombre) {
        this.codCliente = codCliente;
        this.Nombre = Nombre;
    }

    public int getCodCliente() {
        return codCliente;
    }

    @Override
    public String toString() {
        return Nombre;
    }
}
