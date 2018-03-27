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
    
    public int getCi(){
        return this.ci;
    }
    
    public int getTelefono() {
        return telefono;
    }

    public String getNombre() {
        return nombre;
    }
    
        //Método de ver si el cliente ha pagado todos sus tickets pendientes
    public boolean isSolvente(){
        return this.carro.getTicketsPorPagar().contar(this.carro.getTicketsPorPagar().getRaiz()) == 0;
    }
    
        //Retirar un ticket conociendo su identificador
    public void deshacerCompra(int cod){
        this.carro.getTicketsPorPagar().eliminarNodo(this.carro.getTicketsPorPagar().getRaiz(), cod);
    }
    
        //Comprar un ticket conociendo su identificador
    public void hacerCompra(int cod){
        Ticket t = (Ticket)this.carro.getTicketsPorPagar().buscarNodo(this.carro.getTicketsPorPagar().getRaiz(), cod).getDato();
        this.carro.getTicketsPorPagar().eliminarNodo(this.carro.getTicketsPorPagar().getRaiz(), cod);
        this.carro.getTicketsPagados().agregar(this.carro.getTicketsPagados().getRaiz(), new NodoArbol(t, t.getId()));
    }
    
}