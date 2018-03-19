package ManejadorDeLaApp;

import CodigoEstructuras.*;

public class Cliente {
    
    private int ci, telefono;
    private String nombre;
    private Arbol tickets = new Arbol();
    private boolean solvente = true;
    
    public Cliente(int ci, int telefono, String nombre){   //Constructor con datos del cliente
        this.ci = ci;
        this.telefono = telefono;
        this.nombre = nombre;
    }
    
        //Agregar n tickets al carrito
    public void agregarTickets(Ticket ticket, int cantidad){
        
    }
    
        //Método de ver si todos los tickets estan pagados
    public void ticketsPagados(){
        
    }
    
        //Pagar n Tickets conociendo sus identificadores
    public void pagar(){
        
    }
    
        //Retirar n Tickets conociendo sus identificadores
    public void deshacer(){
        
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
    
    public boolean isSolvente(){
        return this.solvente;
    }
}