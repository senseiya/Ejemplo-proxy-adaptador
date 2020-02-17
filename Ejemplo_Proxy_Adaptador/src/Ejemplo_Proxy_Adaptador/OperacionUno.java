
package Ejemplo_Proxy_Adaptador;


public class OperacionUno implements InterfazOperaciones {

    public OperacionUno(){
        
    }

    @Override
    public void operacion() {
        System.out.println("Creando un videojuego");
        System.out.println("agregando escenarios y mobs");
    }
}
