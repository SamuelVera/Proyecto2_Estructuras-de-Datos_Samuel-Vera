package CodigoEstructuras;

public class NodoArbol <T>{
    
    private T dato;
    private NodoArbol<T> padre, HijoI, HijoD;
    private int codigo;
    private String codigo2;
    
    public NodoArbol(T dato, int codigo){
        this.dato = dato;
        this.codigo = codigo;
    }
    
    public NodoArbol(T dato, String codigo2){
        this.dato = dato;
        this.codigo2 = codigo2;
    }
    
    public int getCodigo(){
        return this.codigo;
    }
    
    public String getCodigo2(){
        return this.codigo2;
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
