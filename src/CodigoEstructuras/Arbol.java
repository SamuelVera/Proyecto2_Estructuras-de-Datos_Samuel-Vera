package CodigoEstructuras;

import EstructuraDeClases.Pelicula;

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
        if(aux != null){
            int comparar = n.getCodigo2().compareToIgnoreCase(aux.getCodigo2());
            if(comparar < 0){
                if(aux.getHijoI() == null){
                    n.setPadre(aux);
                    aux.setHijoI(n);
                }else{
                    this.agregarString(aux.getHijoI(), n);
                }
            }else if(comparar > 0){
                if(aux.getHijoD() == null){
                    n.setPadre(aux);
                    aux.setHijoD(n);
                }else{
                    this.agregarString(aux.getHijoD(), n);
                }
            }
        }else if(this.isVacio()){
            this.raiz = n;
        }
    }
    
    public void agregar(NodoArbol aux, NodoArbol n){
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
        }else if(this.isVacio()){
            this.raiz = n;
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
    
    public void getTodosLosCodigos(NodoArbol n, int[] aux){
        if(n != null){
            for(int i=0;i<aux.length;i++){
                if(aux[i] == 0){
                    aux[i] = n.getCodigo();
                    break;
                }
            }
            this.getTodosLosCodigos(n.getHijoD(),aux);
            this.getTodosLosCodigos(n.getHijoI(),aux);
        }
    }
    
    public void getTodosLosCodigos(NodoArbol n, String[] aux){
        if(n != null){
            for(int i=0;i<aux.length;i++){
                if(aux[i]==null){
                    aux[i] = n.getCodigo2();
                    break;
                }
            }
            this.getTodosLosCodigos(n.getHijoD(),aux);
            this.getTodosLosCodigos(n.getHijoI(),aux);
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
    
    public NodoArbol eliminarNodo(NodoArbol n, int codigo) {
        if (raiz != null && raiz.getCodigo() == codigo) {
            return this.eliminarRaiz();
        } else if (n.getHijoI() != null && n.getHijoI().getCodigo() == codigo) {
            return this.eliminarI(n);
        } else if (n.getHijoD() != null && n.getHijoD().getCodigo() == codigo) {
            return this.eliminarD(n);
        }
        return null;
    }
    
    public NodoArbol eliminarNodo(NodoArbol n, String codigo) {
        if(n!=null){
            int comparar = n.getCodigo2().compareToIgnoreCase(codigo);
            int comparar2 = n.getHijoI().getCodigo2().compareToIgnoreCase(codigo);
            int comparar3 = n.getHijoD().getCodigo2().compareToIgnoreCase(codigo);
            if (this.raiz != null && comparar == 0) {
                return this.eliminarRaiz();
            } else if (n.getHijoI() != null && comparar2 == 0) {
                return this.eliminarI(n);
            } else if (n.getHijoD() != null && comparar3 == 0) {
                return this.eliminarD(n);
            }
        }
        return null;
    }
    
    private NodoArbol eliminarRaiz() {
        NodoArbol aux = this.raiz;
        this.raiz = null;
        if (aux.getHijoI() != null && aux.getHijoD() != null) {
            this.raiz = aux.getHijoD();
            NodoArbol aux2 = aux.getHijoD();
            while (aux2.getHijoI() != null) {
                aux2 = aux2.getHijoI();
            }
            aux2.setHijoI(aux.getHijoI());
            return aux;
        } else if (aux.getHijoI() != null) {
            this.raiz = aux.getHijoI();
            return aux;
        } else if (aux.getHijoD() != null) {
            this.raiz = aux.getHijoD();
            return aux;
        }
        return null;
    }
    
    private NodoArbol eliminarI(NodoArbol n) {
        if (n.getHijoI() != null) {
            NodoArbol aux = n.getHijoI();
            n.setHijoI(null);
            if (aux.getHijoI() != null && aux.getHijoD() != null) {
                NodoArbol aux2 = aux.getHijoI();
                n.setHijoI(aux.getHijoI());
                while (aux2.getHijoD() != null) {
                    aux2 = aux2.getHijoD();
                }
                aux2.setHijoD(aux.getHijoD());
            } else if (aux.getHijoI() != null) {
                n.setHijoI(aux.getHijoI());
            } else if (aux.getHijoD() != null) {
                n.setHijoI(aux.getHijoD());
            }
            return aux;
        }
        return null;

    }
    
    private NodoArbol eliminarD(NodoArbol n) {
        if (n.getHijoD() != null) {
            NodoArbol aux = n.getHijoD();
            n.setHijoD(null);

            if (aux.getHijoI() != null && aux.getHijoD() != null) {
                NodoArbol aux2 = aux.getHijoD();
                n.setHijoD(aux.getHijoD());
                while (aux2.getHijoI() != null) {
                    aux2 = aux2.getHijoI();
                }
                aux2.setHijoI(aux.getHijoI());
            } else if (aux.getHijoI() != null) {
                n.setHijoD(aux.getHijoI());
            } else if (aux.getHijoD() != null) {
                n.setHijoD(aux.getHijoD());
            }
            return aux;
        }
        return null;
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