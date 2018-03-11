package ManejadorDeLaApp;

import CodigoEstructuras.ListaSimple;

public class Sucursal {
    
    private int codigo;
    private String ubicacion;
    private ListaSimple clientes = new ListaSimple();
    private ListaSimple salas = new ListaSimple();
    
    public Sucursal(int codigo, String ubicacion){
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        MenuInicio.estructura.agregar(this, 0, this.codigo);
    }
    
    public int getCodigo(){
        return this.codigo;
    }

    public String getUbicacion() {
        return this.ubicacion;
    }
    
    public void agregarCliente(Cliente cliente){
        this.clientes.insertPrimero(cliente);
    }
    
    public void agregarSala(Sala2D aux){
        this.salas.insertPrimero(aux);
    }
    
    public void agregarSala(Sala3D aux){
        this.salas.insertPrimero(aux);
    }
    
    public void agregarSala(Sala4DX aux){
        this.salas.insertPrimero(aux);
    }

    public ListaSimple getSalas() {
        return this.salas;
    }
    
}
