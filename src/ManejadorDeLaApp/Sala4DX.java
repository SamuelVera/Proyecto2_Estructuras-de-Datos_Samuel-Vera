package ManejadorDeLaApp;

import CodigoEstructuras.*;

public class Sala4DX extends Sala{

    public Sala4DX(int numero, Sucursal sucursal) {
        super(numero, sucursal);
    }

    @Override
    public double ventasDia(NodoArbol n) {
        if(n!=null){
            Ticket aux = (Ticket)n.getDato();
            if(this.fd.format(aux.getFecha()).equals(this.fd.format(MenuInicio.fecha))){
                return aux.getPrecioTicket() + this.ventasDia(n.getHijoD()) + this.ventasDia(n.getHijoI());
            }
            return this.ventasDia(n.getHijoD()) + this.ventasDia(n.getHijoI());
        }
        return 0;
    }
}
