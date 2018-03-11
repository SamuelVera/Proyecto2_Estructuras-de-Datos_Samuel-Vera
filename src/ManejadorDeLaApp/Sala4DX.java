package ManejadorDeLaApp;

import CodigoEstructuras.Cola;

public class Sala4DX extends Sala{

    public Sala4DX(int numero, Sucursal sucursal) {
        super(numero, sucursal);
    }

    @Override
    public void verPeliculas() {
        System.out.println("Función en 4DX");
    }
    
    @Override
    public void agregarPelicula(Pelicula pelicula){
        this.peliculas.encolar(pelicula);
    }

    @Override
    public void ventas() {
        this.venta += Ticket.getPrecio4D();
    }
    
    @Override
    public void agregarTicketVendido() {
        this.ticketsVendidosDia.insertPrimero(1);
    }
    
    @Override
    public int getNumero() {
        return this.numero;
    }
}
