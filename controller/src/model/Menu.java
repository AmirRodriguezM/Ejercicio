
package model;

public class Menu {
    
    private String entrada="";
    private String platoFuerte="";
    private String bebida="";        
    private String postre="";        
    private long precio=0;   
    
    public Menu (String entrada, String platoFuerte, String bebida, String postre, long precio) {
        this.entrada = entrada;
        this.platoFuerte = platoFuerte;
        this.bebida = bebida;
        this.postre = postre;
        this.precio = precio;
        
    }
    public Menu() {
        
    }
    
    
        
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public void setPlatoFuerte(String platoFuerte) {
        this.platoFuerte = platoFuerte;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    public String getEntrada() {
        return entrada;
    }

    public String getPlatoFuerte() {
        return platoFuerte;
    }

    public String getBebida() {
        return bebida;
    }

    public String getPostre() {
        return postre;
    }

    public long getPrecio() {
        return precio;
    }
    
    public static void mostrarMenu() {
        
    }

    @Override
    public String toString() {
        return "Menu{" + "entrada=" + entrada + ", platoFuerte=" + platoFuerte + ", bebida=" + bebida + ", postre=" + postre + ", precio=" + precio + '}';
    }
                    
    
}
