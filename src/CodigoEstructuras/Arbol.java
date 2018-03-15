package CodigoEstructuras;

public class Arbol <T>{
    
    private NodoArbol<T> raiz;
    
    public Arbol(){
        this.raiz = null;
    }
    
    public boolean isVacio(){
        return this.raiz == null;
    }
    
    public NodoArbol getRaiz(){
        return this.raiz;
    }
    
        //Agregar elemento un número a un árbol binario de búsqueda sin repetirlos
    public void agregar(NodoArbol n1, NodoArbol n2){
        
        if(this.isVacio()){
            this.raiz = n2;
        }else{
            int comparar = ((String)n2.getDato()).compareTo((String)n1.getDato());
            if(comparar < 0){
                if(n1.getHijoI() == null){
                    n1.setHijoI(n2);
                    n2.setPadre(n1);
                }else{
                    this.agregar(n1.getHijoI(), n2);
                }
            }else if(comparar > 0){
                if(n1.getHijoD() == null){
                    n1.setHijoD(n2);
                    n2.setPadre(n1);
                }else{
                    this.agregar(n1.getHijoD(), n2);
                }
            }
        }
    }
    
    public int contar(NodoArbol n){
        if(n == null){
            return 0;
        }else{
            return 1 + (this.contar(n.getHijoI()) + this.contar(n.getHijoD()));
        }
    }
}
