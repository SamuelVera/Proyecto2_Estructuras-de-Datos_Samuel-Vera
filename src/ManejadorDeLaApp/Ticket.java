package ManejadorDeLaApp;

import java.util.Date;

public class Ticket {
    
    private int id;
    private static double precio2D, precio3D, precio4D;
    private Sucursal sucursal;
    private Sala sala;
    private Pelicula pelicula;
    private Cliente cliente;
    private Date fecha;
    private boolean pagado = false;

    public Ticket(int id, double precio2D, double precio3D, double precio4D, Sucursal sucursal, Sala sala, Pelicula pelicula, Cliente cliente, Date fecha) {
        
        this.id = id;
        this.sucursal = sucursal;
        this.sala = sala;
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.fecha = fecha;
        
    }

    public static void setPrecio2D(double precio2D) {
        Ticket.precio2D = precio2D;
    }

    public static void setPrecio3D(double precio3D) {
        Ticket.precio3D = precio3D;
    }

    public static void setPrecio4D(double precio4D) {
        Ticket.precio4D = precio4D;
    }



    public static double getPrecio2D() {
        return Ticket.precio2D;
    }

    public static double getPrecio3D() {
        return Ticket.precio3D;
    }

    public static double getPrecio4D() {
        return Ticket.precio4D;
    }

    public boolean isPagado() {
        return this.pagado;
    }

    public Sala getSala() {
        return this.sala;
    }
    
    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public int getId() {
        return this.id;
    }
}
