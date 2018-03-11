package ManejadorDeLaApp;

import CodigoEstructuras.Cola;

public class Sala3D extends Sala{
    
    public Sala3D(int numero, Sucursal sucursal) {
        super(numero, sucursal);
    }

    @Override
    public void verPeliculas() {
        System.out.println("Función en 3D");
        
    }
    
    @Override
    public void agregarPelicula(Pelicula pelicula){
        this.peliculas.encolar(pelicula);
    }

    @Override
    public void ventas() {
        this.venta += Ticket.getPrecio3D();
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
