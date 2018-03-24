package ManejadorDeLaApp;

import CodigoEstructuras.*;

public class Cliente {
    
    private int ci, telefono;
    private String nombre;
    private Arbol tickets = new Arbol();
    
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
    public boolean isSolvente(NodoArbol n){
        if(n!=null){
            if(!((Ticket)n.getDato()).isPagado()){
                return false;
            }
            return isSolvente(n.getHijoD())&& isSolvente(n.getHijoI());
        }else{
            return true;
        }
    }
    
    public void getTicketsPagados(NodoArbol n, ListaSimple aux){
        if(n != null){
            if(((Ticket)n.getDato()).isPagado()){
                aux.insertPrimero(n.getDato());
            }
            this.getTicketsPagados(n.getHijoD(),aux);
            this.getTicketsPagados(n.getHijoI(),aux);
        }
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
    
    public void setSolvente(){
        this.isSolvente(this.tickets.getRaiz());
    }
    
    public Arbol getArbolTickets(){
        return this.tickets;
    }
}