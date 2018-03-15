package ManejadorDeLaApp;

import CodigoEstructuras.ListaSimple;
import CodigoEstructuras.NodoSimple;

public class Cliente {
    
    private int ci, telefono;
    private String nombre;
    private ListaSimple tickets;
    private boolean solvente;
    
    public Cliente(int ci, int telefono, String nombre){   //Constructor con datos del cliente
        this.ci = ci;
        this.telefono = telefono;
        this.nombre = nombre;
    }
    
        //Agregar n tickets al carrito
    public void agregarTickets(Ticket ticket, int cantidad){
        
        while(cantidad != 0){
            this.tickets.insertPrimero(ticket);
            cantidad--;
        }
        
    }
    
        //Método de ver si todos los tickets estan pagados
    public void ticketsPagados(){
        
        int temp = 0;
        NodoSimple aux = this.tickets.getCabeza();
        
        while(aux != null){
            if(((Ticket)aux.getDato()).isPagado() == false){
                this.solvente = false;
            }else{
                ((Ticket)aux.getDato()).getSala().agregarTicketVendido();
                temp++;
            }
            aux = aux.getProximo();
        }
        
        if(temp == this.tickets.contarElementos()){
            this.solvente = true; //Todos los tickets fueron pagados
        }
        
    }
    
        //Pagar n Tickets conociendo sus identificadores
    public void pagar(int[] id){
        
        NodoSimple aux = this.tickets.getCabeza();
        
        while(aux != null){
            for(int i=0;i<id.length;i++){
                if(!((Ticket)aux.getDato()).isPagado() && id[i] == ((Ticket)aux.getDato()).getId()){
                    ((Ticket)aux.getDato()).setPagado(true);
                    break;
                }
            }
            aux = aux.getProximo();
        }
        
        ticketsPagados();
        
    }
    
        //Retirar n Tickets conociendo sus identificadores
    public void deshacer(int[] id){
        
        NodoSimple aux = this.tickets.getCabeza();
        int pos = 0;
        
        while(aux != null){
            for(int i=0;i<id.length;i++){
                if(id[i] == ((Ticket)aux.getDato()).getId()){
                    this.tickets.eliminarPosicion(pos);
                    pos--;
                    break;
                }
            }
            pos++;
        }
        
    }
}