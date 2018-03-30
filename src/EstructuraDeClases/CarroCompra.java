package EstructuraDeClases;

import CodigoEstructuras.*;

/*Clase carro de compra del cliente donde tiene dos ABB uno de los tickets ya
pagados y otro de los tickets por pagar.*/
public class CarroCompra {
    
    private Arbol ticketsPagos = new Arbol();
    private Arbol ticketsPorPagar = new Arbol();
    
        //Retornar el ABB de tickets pagados.
    public Arbol getTicketsPagados(){
        return this.ticketsPagos;
    }
    
        //Retornar el ABB de tickets por pagar.
    public Arbol getTicketsPorPagar(){
        return this.ticketsPorPagar;
    }
}
