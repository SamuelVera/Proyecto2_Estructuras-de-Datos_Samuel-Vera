package CodigoEstructuras;

public class Pila <T> extends ListaSimple<T>{
    
    public void push(T dato){
        this.insertPrimero(dato);
    }
    
    public void pop(){
        this.eliminarPrimero();
    }
    
    public void peek(){
        
    }
}
