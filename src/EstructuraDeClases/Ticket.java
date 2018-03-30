package EstructuraDeClases;

import java.util.Date;

/*Clase Ticket:
*En contexto dinámico posee:
    -Un identificador único de 7 dígitos.
    -Una sala.
    -Una película.
    -Un cliente que lo compra.
    -Una fecha.
    -3 booleans que determinan si es para sala 2D, 3D o 4DX.
*En contexto estático:
    -Precio de los tickets 2D, 3D y 4DX.
*/
public class Ticket {
    
    private int id;
    private static double precio2D, precio3D, precio4D;
    private double precioTicket;
    private Sala sala;
    private Pelicula pelicula;
    private Cliente cliente;
    private Date fecha;
    private boolean dd, ddd, dx;

        //Constructor de la clase.
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

        //Cambiar el precio del ticket(individual).
    public void setPrecioTicket(double precio){
        this.precioTicket = precio;
    }
    
        //Cambiar precio de los tickets 2D.
    public static void setPrecio2D(double precio2) {
        Ticket.precio2D = precio2;
    }

        //Cambiar precio de los tickets 3D.
    public static void setPrecio3D(double precio3) {
        Ticket.precio3D = precio3;
    }

        //Cambiar precio de los tickets 4DX.
    public static void setPrecio4D(double precio4) {
        Ticket.precio4D = precio4;
    }

        //Retornar sala a la que pertene el ticket.
    public Sala getSala() {
        return sala;
    }

        //Retornar precio de los tickets 2D.
    public static double getPrecio2D() {
        return Ticket.precio2D;
    }

        //Retornar precio de los tickets 3D.
    public static double getPrecio3D() {
        return Ticket.precio3D;
    }

        //Retornar precio de los tickets 4DX.
    public static double getPrecio4D() {
        return Ticket.precio4D;
    }

        //Retornar código del ticket.
    public int getId() {
        return this.id;
    }
    
        //Retornar película a la que pertenece.
    public String getNombrePelicula(){
        return this.pelicula.getNombre();
    }

        //Retornar el precio del ticket.
    public double getPrecioTicket() {
        return precioTicket;
    }
    
        //Retornar si es para función 2D.
    public boolean is2D(){
        return this.dd;
    }
    
        //Retornar si es para función 3D.
    public boolean is3D(){
        return this.ddd;
    }        
    
        //Retornar si es para función 4DX.
    public boolean is4D(){
        return this.dx;
    }
    
        //Retornar fecha del ticket.
    public Date getFecha(){
        return this.fecha;
    }
}
