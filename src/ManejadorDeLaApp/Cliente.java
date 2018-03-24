package ManejadorDeLaApp;

import CodigoEstructuras.*;

public class Cliente {
    
    private int ci, telefono;
    private String nombre;
    private CarroCompra carro = new CarroCompra();
    
    public Cliente(int ci, int telefono, String nombre){   //Constructor con datos del cliente
        this.ci = ci;
        this.telefono = telefono;
        this.nombre = nombre;
    }
    
        //Agregar tickets al carrito
    public void agregarTickets(Ticket ticket){
        this.carro.getTicketsPorPagar().agregar(this.carro.getTicketsPorPagar().getRaiz(), new NodoArbol(ticket,ticket.getId()));
    }
    
    public CarroCompra getCarro(){
        return this.carro;
    }
    
        //Método de ver si todos los tickets estan pagados
    public boolean isSolvente(){
        return this.carro.getTicketsPorPagar().contar(this.carro.getTicketsPorPagar().getRaiz()) == 0;
    }
    
        //Retirar n Tickets conociendo sus identificadores
    public void deshacer(int cod){
        this.carro.getTicketsPorPagar().eliminarNodo(this.carro.getTicketsPorPagar().getRaiz(), cod);
    }
    
    public int getCi(){
        return this.ci;
    }
    
    public int getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }
}