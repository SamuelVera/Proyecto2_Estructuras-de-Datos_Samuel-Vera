package CodigoEstructuras;

public class ListaSimple <T>{
    
    private NodoSimple<T> cabeza;
    
    public NodoSimple<T> getCabeza() {
        return this.cabeza;
    }
    
    public void setCabeza(NodoSimple<T> Cabeza){
        this.cabeza = cabeza;
    }
    
    public boolean isVacio(){
        return this.cabeza == null;
    }
    
    public void insertPrimero(T dato){
        if(this.isVacio()){
            this.cabeza = new NodoSimple<>(dato);
        }else{
            NodoSimple<T> aux = new NodoSimple<>(dato);
            aux.setProximo(this.cabeza);
            this.cabeza = aux;
        }
    }
    
    public T eliminarPrimero(){
        if(!this.isVacio()){
            NodoSimple<T> aux = this.cabeza;
            this.cabeza = this.cabeza.getProximo();
            return aux.getDato();
        }else{
            return null;
        }
    }
    
    public T eliminarUltimo(){
        if(!this.isVacio()){
            NodoSimple<T> aux = this.cabeza;
            while(aux.getProximo().getProximo() != null){
                aux = aux.getProximo();
            }
            NodoSimple<T> temp = aux.getProximo();
            aux.setProximo(null);
            return temp.getDato();
        }else{
            return null;
        }
    }
    
    public T eliminarPosicion(int pos){
        if(this.isVacio()){
            return null;
        }else{
            if(pos == 0){
                return this.eliminarPrimero();
            }else if(pos == this.contarElementos()-1){
                return this.eliminarUltimo();
            }else{
                NodoSimple<T> aux = this.cabeza;
                int cont = 0;
                while(cont != pos-1){
                    aux = aux.getProximo();
                    cont++;
                }
                NodoSimple<T> temp = aux.getProximo();
                aux.setProximo(temp.getProximo());
                return temp.getDato();
            }
        }
    }
    
    public int contarElementos(){
        if(this.isVacio()){
            return 0;
        }else{
            int cont = 0;
            NodoSimple<T> aux = this.cabeza;
            while(aux != null){
                cont++;
                aux = aux.getProximo();
            }
            return cont;
        }
    }
}