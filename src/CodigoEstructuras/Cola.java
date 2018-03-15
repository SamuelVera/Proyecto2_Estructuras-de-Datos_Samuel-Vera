package CodigoEstructuras;

public class Cola <T>{

    private NodoSimple <T> cabeza;
    
    public NodoSimple getCabeza(){
        return this.cabeza;
    }
    
    public boolean isVacio(){
        return this.cabeza == null;
    }
    
    public void encolar(T dato){
        
        if(this.isVacio()){
            this.cabeza = new NodoSimple<>(dato);
        }else{
            NodoSimple<T> n = new NodoSimple<>(dato);
            
            n.setProximo(this.cabeza);
            this.cabeza = n;
            
        }
        
    }
    
    public T desencolar(){
        
        if(this.isVacio()){
            return null;
        }else{
            NodoSimple<T> aux = this.cabeza;
            NodoSimple<T> temp;
            
            while(aux.getProximo().getProximo()!=null){
                aux = aux.getProximo();
            }
            
            temp=aux.getProximo();
            aux.setProximo(null);
            
            return temp.getDato();
        }
    }
     
    public T getPrimeroEnCola(){
        
        if(this.isVacio()){
            return null;
        }else{
            
            NodoSimple<T> aux = this.cabeza;
            
            while(aux.getProximo() != null){
                aux = aux.getProximo();
            }
            
            return aux.getDato();
        }
        
    }
    
}
