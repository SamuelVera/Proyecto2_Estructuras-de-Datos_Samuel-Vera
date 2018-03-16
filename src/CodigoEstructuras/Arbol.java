package CodigoEstructuras;

import ManejadorDeLaApp.Pelicula;

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
    
        /*Este método se implementa solo al agregar las películas*/
    public void agregarString(NodoArbol aux, NodoArbol n){
        if(this.isVacio()){
            this.raiz = n;
        }else{
            if(aux != null){
                int comparar = n.getCodigo2().compareToIgnoreCase(aux.getCodigo2());
                if(comparar < 0){
                    if(aux.getHijoI() == null){
                        aux.setHijoI(n);
                        n.setPadre(aux);
                    }else{
                        this.agregarString(aux.getHijoI(), n);
                    }
                }else if(comparar > 0){
                    if(aux.getHijoD() == null){
                        aux.setHijoD(n);
                        n.setPadre(aux);
                    }else{
                        this.agregarString(aux.getHijoD(), n);
                    }
                }
            }
        }   
    }
    
        
    public void agregar(NodoArbol aux, NodoArbol n){
        
        if(this.isVacio()){
            this.raiz = n;
        }else{
            if(aux != null){
                if(aux.getCodigo() > n.getCodigo()){
                    if(aux.getHijoI() == null){
                        n.setPadre(aux);
                        aux.setHijoI(n);
                    }else{
                        this.agregar(aux.getHijoI(), n);
                    }
                }else if(aux.getCodigo() < n.getCodigo()){
                    if(aux.getHijoD() == null){
                        n.setPadre(aux);
                        aux.setHijoD(n);
                    }else{
                        this.agregar(aux.getHijoD(), n);
                    }
                }
            }
        }
    }
    
    public NodoArbol buscarNodo(NodoArbol n, int codigo){
        if(n != null){
            if(n.getCodigo() == codigo){
                return n;
            }else{
                if(n.getCodigo() < codigo){
                    return this.buscarNodo(n.getHijoD(), codigo);
                }else{
                    return this.buscarNodo(n.getHijoI(), codigo);
                }
            }
        }else{
            return null;
        }
    }
    
    public NodoArbol buscarNodo(NodoArbol n, String codigo){
        if(n != null){
            int comparar = n.getCodigo2().compareTo(codigo);
            if(comparar < 0){
                return this.buscarNodo(n.getHijoD(), codigo);
            }else if(comparar > 0){
                return this.buscarNodo(n.getHijoI(), codigo);
           }else{
                return n;
            }
        }else{
            return null;
        }
    }
    
    public void getTodosLosCodigos(NodoArbol n, int[] aux, int i){
        if(n != null){
            aux[i] = n.getCodigo();
            i++;
            this.getTodosLosCodigos(n.getHijoD(),aux,i);
            this.getTodosLosCodigos(n.getHijoI(),aux,i);
        }
    }
    
    public void getTodosLosCodigos(NodoArbol n, String[] aux, int i){
        if(n != null){
            aux[i] = n.getCodigo2();
            i++;
            this.getTodosLosCodigos(n.getHijoD(),aux,i);
            this.getTodosLosCodigos(n.getHijoI(),aux,i);
        }
    }
    
    public boolean estaNodo(NodoArbol aux, int codigo){
        if(aux != null){
            if(aux.getCodigo() == codigo){
                return true;
            }else{
                return estaNodo(aux.getHijoI(),codigo) || estaNodo(aux.getHijoD(),codigo);
            }
        }else{
            return false;
        }
    }
    
    public int contar(NodoArbol n){
        if(n == null){
            return 0;
        }else{
            return 1 + (this.contar(n.getHijoI()) + this.contar(n.getHijoD()));
        }
    }
    
    public void mostrar(NodoArbol n){
        if(n!=null){
            System.out.println(n.getCodigo2());
            this.mostrar(n.getHijoI());
            this.mostrar(n.getHijoD());
        }
    }
}
