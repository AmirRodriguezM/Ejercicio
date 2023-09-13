
package view;

import javax.swing.JOptionPane;

public class Ventana {
    
    public static String solicitarPedido() {
        
        String pedido=JOptionPane.showInputDialog("Ingrese el primer pedido");
        
        return pedido;
        
    }
    
    public static void mostrarConfirmacionPedido(String pedido) {
        
        JOptionPane.showMessageDialog(null, pedido);
        
    }
    
}
