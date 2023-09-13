
package controller;

import model.Menu;
import view.Ventana;

public class Restaurante {
    static Menu objetoMenu=new Menu();
    public static void main(String[] args) {
        
        String entrada=Ventana.solicitarPedido();
        objetoMenu.setEntrada(entrada);
        Ventana.mostrarConfirmacionPedido(objetoMenu.toString());
    }
    
}
