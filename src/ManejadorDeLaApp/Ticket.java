package ManejadorDeLaApp;

import java.util.Date;

public class Ticket {
    
    private int id;
    private static double precio2D, precio3D, precio4D;
    private Sala sala;
    private Pelicula pelicula;
    private Cliente cliente;
    private Date fecha;
    private boolean pagado = false, dd, ddd, dx;

    public Ticket(int id, Pelicula pelicula, Sala sala,Cliente cliente, boolean dd, boolean ddd, boolean dx, boolean pagado) {
        
        this.id = id;
        this.pelicula = pelicula;
        this.sala = sala;
        this.cliente = cliente;
        this.fecha = fecha;
        this.dd = dd;
        this.ddd = ddd;
        this.dx = dx;
        this.pagado = pagado;
        
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

    public Sala getSala() {
        return sala;
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
    
    public void setPagado(boolean pagado) {
        this.pagado = pagado;
    }

    public int getId() {
        return this.id;
    }
}
