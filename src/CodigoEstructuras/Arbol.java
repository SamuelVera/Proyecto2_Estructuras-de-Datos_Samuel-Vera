package CodigoEstructuras;

public class Arbol <T>{
    
    private NodoArbol<T> raiz;
    
    public Arbol(){
    
        this.raiz = null;
    
    }
    
    public boolean isVacio(){
        
        return this.raiz == null;
        
    }
    
    public void agregar(T dato, int accesoPadre, int acceso){
        
        if(this.isVacio()){
            this.raiz = new NodoArbol(dato,acceso);
        }else{
            
            
            
        }
        
    }
    
    
    
}
