package CodigoEstructuras;

public class Pila <T> {
    
    private NodoSimple<T> tope;
    
    public boolean isVacio(){
        return this.tope == null;
    }
    
    public void push(T dato){
        
        NodoSimple<T> n = new NodoSimple(dato);
        
        if(this.isVacio()){
            
            this.tope = n;
            
        }else{
            
            n.setProximo(this.tope);
            this.tope = n;
            
        }
    }
    
    public T pop(){
        
        if(this.isVacio()){
            
            return null;
            
        }else{
            
            NodoSimple<T> aux = this.tope;
            this.tope = aux.getProximo();
            
            return aux.getDato();
        }
        
    }
    
    public T peek(){
        
        if(this.isVacio()){
            
            return null;
            
        }else{
            
            return this.tope.getDato();
            
        }
    }
}
