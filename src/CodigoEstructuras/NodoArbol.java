package CodigoEstructuras;

public class NodoArbol <T>{
    
    private T dato;
    private int acceso;
    private NodoArbol<T> padre;
    
    public NodoArbol(T dato, int acceso){
        this.dato = dato;
        this.acceso = acceso;
    }

    public boolean isRaiz(){
        return this.padre == null;
    }
    
    /*public boolean isHoja(){
        return this.hijos.isVacio();
    }*/
    
    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public NodoArbol<T> getPadre() {
        return padre;
    }

    public void setPadre(NodoArbol<T> padre) {
        this.padre = padre;
    }

    /*public void setHijo(T dato, int acceso) {
        this.hijos.insertPrimero(new NodoArbol(dato,acceso));
    }*/

    public int getAcceso() {
        return acceso;
    }
    
    
}
