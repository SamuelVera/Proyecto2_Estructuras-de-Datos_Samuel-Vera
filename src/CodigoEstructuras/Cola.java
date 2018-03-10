package CodigoEstructuras;

public class Cola <T> extends ListaSimple{

    
    public void encolar(T dato){
        this.insertPrimero(dato);
    }
    
    public T desencolar(){
        return (T) this.eliminarPrimero();
    }
     
    public T getPrimeroEnCola(){
        
        return (T) this.getCabeza();
        
    }
    
}
