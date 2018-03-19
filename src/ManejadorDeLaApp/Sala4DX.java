package ManejadorDeLaApp;

import CodigoEstructuras.*;

public class Sala4DX extends Sala{

    public Sala4DX(int numero, Sucursal sucursal) {
        super(numero, sucursal);
    }

    @Override
    public void verPeliculas() {
        System.out.println("Función en 4DX");
    }

    @Override
    public void ventas() {
        this.venta += Ticket.getPrecio4D();
    }
    
    @Override
    public void agregarTicketVendido(Ticket ticket) {
        this.ticketsVendidosDia.agregar(this.ticketsVendidosDia.getRaiz(),new NodoArbol(ticket,ticket.getId()));
    }
}
