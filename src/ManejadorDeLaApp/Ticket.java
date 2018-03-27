package ManejadorDeLaApp;

import java.util.Date;

public class Ticket {
    
    private int id;
    private static double precio2D, precio3D, precio4D;
    private double precioTicket;
    private Sala sala;
    private Pelicula pelicula;
    private Cliente cliente;
    private Date fecha;
    private boolean dd, ddd, dx;

    public Ticket(int id, Pelicula pelicula, Sala sala, Cliente cliente, boolean dd, boolean ddd, boolean dx, Date fecha) {
        
        this.id = id;
        this.pelicula = pelicula;
        this.sala = sala;
        this.cliente = cliente;
        this.fecha = fecha;
        this.dd = dd;
        this.ddd = ddd;
        this.dx = dx;
        if(sala instanceof Sala2D){
            this.precioTicket = Ticket.getPrecio2D();
        }else if(sala instanceof Sala3D){
            this.precioTicket = Ticket.getPrecio3D();
        }else{
            this.precioTicket = Ticket.getPrecio4D();
        }
        
    }

    public void setPrecioTicket(double precio){
        this.precioTicket = precio;
    }
    
    public static void setPrecio2D(double precio2) {
        Ticket.precio2D = precio2;
    }

    public static void setPrecio3D(double precio3) {
        Ticket.precio3D = precio3;
    }

    public static void setPrecio4D(double precio4) {
        Ticket.precio4D = precio4;
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

    public int getId() {
        return this.id;
    }
    
    public String getNombrePelicula(){
        return this.pelicula.getNombre();
    }

    public double getPrecioTicket() {
        return precioTicket;
    }
    
    public boolean is2D(){
        return this.dd;
    }
    
    public boolean is3D(){
        return this.ddd;
    }        
    
    public boolean is4D(){
        return this.dx;
    }
    
    public Date getFecha(){
        return this.fecha;
    }
    
}
