package ManejadorDeLaApp;

import CodigoEstructuras.*;
import java.util.Random;

public class Sucursal {
    
    private int codigo;
    private String ubicacion;
    //private ListaSimple clientes = new ListaSimple();
    private ListaSimple salas = new ListaSimple();
    
    public Sucursal(String ubicacion){
        
        this.codigo = this.generarCodigo();
        this.ubicacion = ubicacion;
        
    }
    
        //Generador del código aleatorio
    private int generarCodigo(){
        int cod = 0, aux2, multi=1000;
        Random rand = new Random();
        NodoSimple aux = MenuInicio.sucursales.getCabeza();
        if(aux != null){
            boolean pasar=false;
            int cont = 0;
            while(pasar == false){
                do{
                    
                    aux2 = rand.nextInt(9)+1;
                    cod = cod + aux2*multi;
                    multi = multi/10;
                    
                }while(multi != 1);
                
                while(aux != null){
                    
                    if(((Sucursal)aux.getDato()).getCodigo() == cod){
                        
                        cont++;
                    
                    }
                    aux = aux.getProximo();
                }
                
                if(cont != 0){
                    
                    cod = 0;
                    multi = 1000;
                    
                }else{
                    
                    pasar = true;
                    
                }
            }
        }else{
            
            do{
                
                aux2 = rand.nextInt(9)+1;
                cod = cod + aux2*multi;
                multi = multi/10;
                
            }while(multi!=1);
            
        }
        
        return cod;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getUbicacion() {
        return this.ubicacion;
    }
    
    /*public void agregarCliente(Cliente cliente){
        this.clientes.insertPrimero(cliente);
    }*/
    
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
