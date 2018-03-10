package ManejadorDeLaApp;

import CodigoEstructuras.ListaSimple;

public class Sucursal {
    
    private int codigo;
    private String ubicacion;
    private ListaSimple clientes;
    
    public Sucursal(int codigo, String ubicacion){
        this.codigo = codigo;
        this.ubicacion = ubicacion;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public void agregarCliente(Cliente cliente){
        this.clientes.insertPrimero(cliente);
    }
    
}
