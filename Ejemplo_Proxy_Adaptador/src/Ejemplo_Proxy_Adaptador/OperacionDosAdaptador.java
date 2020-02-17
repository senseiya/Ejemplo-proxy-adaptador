
package Ejemplo_Proxy_Adaptador;


public class OperacionDosAdaptador implements InterfazOperaciones {

    private OperacionDos objetodos;
    
    public OperacionDosAdaptador(){
        objetodos = new OperacionDos();
    }
    
    @Override
    public void operacion() {
        System.out.println("Adaptando");
        objetodos.operaciondos();
    }
    
}
