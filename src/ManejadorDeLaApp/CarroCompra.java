package ManejadorDeLaApp;

import CodigoEstructuras.*;

public class CarroCompra {
    
    private Arbol ticketsPagos = new Arbol();
    private Arbol ticketsPorPagar = new Arbol();
    
    public Arbol getTicketsPagados(){
        return this.ticketsPagos;
    }
    
    public Arbol getTicketsPorPagar(){
        return this.ticketsPorPagar;
    }
}
