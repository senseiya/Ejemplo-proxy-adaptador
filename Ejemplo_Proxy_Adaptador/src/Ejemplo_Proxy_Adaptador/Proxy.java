
package Ejemplo_Proxy_Adaptador;


public class Proxy implements InterfazOperaciones {

    OperacionUno objetouno;
    OperacionDosAdaptador objetodos_adaptado;
    public Proxy() {
    }

    @Override
    public void operacion() {
        System.out.println("ejecutando solicitud de operacion 1");
        objetouno= new OperacionUno();
        objetouno.operacion();
        System.out.println("ejecutando solicitud de operacion 2");
        objetodos_adaptado= new OperacionDosAdaptador();
        objetodos_adaptado.operacion();
        
    }
}
