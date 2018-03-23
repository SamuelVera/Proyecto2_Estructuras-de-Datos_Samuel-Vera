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
    public void agregarTickets(Ticket ticket){
        this.tickets.agregar(this.tickets.getRaiz(), new NodoArbol(ticket,ticket.getId()));
    }
    
        //Método de ver si todos los tickets estan pagados
    private boolean ticketsPagados(NodoArbol n){
        if(n!=null){
            if(!((Ticket)n.getDato()).isPagado()){
                return false;
            }
            return this.ticketsPagados(n.getHijoD())&& this.ticketsPagados(n.getHijoI());
        }else{
            return true;
        }
    }
    
        //Pagar Ticket conociendo sus identificadores
    public void pagar(int cod){
        NodoArbol aux = this.tickets.buscarNodo(this.tickets.getRaiz(), cod);
        Sala aux2;
        Sucursal aux3;
        this.tickets.eliminarNodo(this.tickets.getRaiz(), cod);
        ((Ticket)aux.getDato()).setPagado(true);
        ((Ticket)aux.getDato()).getSala().agregarTicket((Ticket)aux.getDato());
        aux2 = ((Ticket)aux.getDato()).getSala();
        aux3 = aux2.getSucursal();
        MenuInicio.sucursales.eliminarNodo(MenuInicio.sucursales.getRaiz(), aux3.getCodigo());
        MenuInicio.sucursales.agregar(MenuInicio.sucursales.getRaiz(), new NodoArbol(aux3, aux3.getCodigo()));
        this.tickets.agregar(this.tickets.getRaiz(), aux);
        this.solvente = this.ticketsPagados(this.tickets.getRaiz());
    }
    
        //Retirar n Tickets conociendo sus identificadores
    public void deshacer(int cod){
        this.tickets.eliminarNodo(this.tickets.getRaiz(), cod);
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
    
    public void setSolvente(boolean solvente){
        this.solvente = false;
    }
    
    public Arbol getArbolTickets(){
        return this.tickets;
    }
}