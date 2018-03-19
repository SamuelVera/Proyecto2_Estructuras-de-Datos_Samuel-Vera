package ManejadorDeLaApp;

import CodigoEstructuras.*;

public class Sala2D extends Sala{
    
    public Sala2D(int numero, Sucursal sucursal) {
        super(numero, sucursal);
    }

    @Override
    public void verPeliculas() {
        System.out.println("Función en 2D");
    }

    @Override
    public void ventas() {
        this.venta += Ticket.getPrecio2D();
    }

    @Override
    public void agregarTicketVendido(Ticket ticket) {
        this.ticketsVendidosDia.agregar(this.ticketsVendidosDia.getRaiz(),new NodoArbol(ticket,ticket.getId()));
    }
    
}
