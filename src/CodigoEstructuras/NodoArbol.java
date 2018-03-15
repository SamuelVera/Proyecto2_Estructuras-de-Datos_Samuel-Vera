package CodigoEstructuras;

public class NodoArbol <T>{
    
    private T dato;
    private NodoArbol<T> padre, HijoI, HijoD;
    
    public NodoArbol(T dato){
        this.dato = dato;
    }

    public boolean isRaiz(){
        return this.padre == null;
    }
    
    public boolean isHoja(){
        return this.HijoI == null && this.HijoD == null;
    }
    
    public T getDato() {
        return this.dato;
    }

    public NodoArbol<T> getPadre() {
        return this.padre;
    }
    
    public NodoArbol<T> getHijoI() {
        return this.HijoI;
    }
    
    public NodoArbol<T> getHijoD() {
        return this.HijoD;
    }

    public void setPadre(NodoArbol<T> padre) {
        this.padre = padre;
    }    
    
    public void setHijoI(NodoArbol<T> n) {
        this.HijoI = n;
    }
    
    public void setHijoD(NodoArbol<T> n) {
        this.HijoD = n;
    }
}
