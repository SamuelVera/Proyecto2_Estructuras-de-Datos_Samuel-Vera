package ManejadorDeLaApp;

import CodigoEstructuras.*;

public class Sala3D extends Sala{
    
    public Sala3D(int numero, Sucursal sucursal) {
        super(numero, sucursal);
    }

    @Override
    public void verPeliculas() {
        System.out.println("Función en 3D");
    }

    @Override
    public void ventas() {
        this.venta += Ticket.getPrecio3D();
    }
}
