package CodigoEstructuras;

public class Cola <T>{

    private NodoSimple <T> ultimo;
    
    public boolean isVacio(){
        return this.ultimo == null;
    }
    
    public void encolar(T dato){
        
        if(this.isVacio()){
            this.ultimo = new NodoSimple<>(dato);
        }else{
            NodoSimple<T> n = new NodoSimple<>(dato);
            n.setProximo(this.ultimo);
            this.ultimo = n;
        }
        
    }
    
    public T desencolar(){
        
        if(this.isVacio()){
            return null;
        }else if(this.ultimo.getProximo() == null){
            NodoSimple<T> aux = this.ultimo;
            this.ultimo = null;
            return aux.getDato();
        }else{
            NodoSimple<T> aux = this.ultimo;
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
            
            NodoSimple<T> aux = this.ultimo;
            
            while(aux.getProximo() != null){
                aux = aux.getProximo();
            }
            
            return aux.getDato();
        }
        
    }
    
}
