package CodigoEstructuras;

public class NodoSimple <T>{
    
    private T dato;
    private NodoSimple<T> proximo;
    
    public NodoSimple(T dato){
        this.dato = dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setProximo(NodoSimple<T> proximo) {
        this.proximo = proximo;
    }
    
    public T getDato() {
        return this.dato;
    }

    public NodoSimple<T> getProximo() {
        return this.proximo;
    }
    
}
