package EstructuraDeClases;

import CodigoEstructuras.*;

/*Clase del cliente registrado, posee:
-Cédula de identidad.
-Número de teléfono.
-Un carro de compras.
-Nombre.
*/
public class Cliente {
    
    private int ci, telefono;
    private String nombre;
    private CarroCompra carro = new CarroCompra();
    
        //Constructor del cliente.
    public Cliente(int ci, int telefono, String nombre){   //Constructor con datos del cliente
        this.ci = ci;
        this.telefono = telefono;
        this.nombre = nombre;
    }
    
        //Agregar tickets al carrito
    public void agregarTickets(Ticket ticket){
        this.carro.getTicketsPorPagar().agregar(this.carro.getTicketsPorPagar().getRaiz(), new NodoArbol(ticket,ticket.getId()));
    }
    
        //Retornar el carro de compras.
    public CarroCompra getCarro(){
        return this.carro;
    }
    
        //Retornar la cédula de identidad.
    public int getCi(){
        return this.ci;
    }
    
        //Retornar el número de teléfono.
    public int getTelefono() {
        return telefono;
    }

        //Retornar el nombre.
    public String getNombre() {
        return nombre;
    }
    
        //Método de ver si el cliente ha pagado todos sus tickets pendientes
    public boolean isSolvente(){
        return this.carro.getTicketsPorPagar().contar(this.carro.getTicketsPorPagar().getRaiz()) == 0;
    }
    
        //Retirar un ticket de carro de compras conociendo su identificador
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