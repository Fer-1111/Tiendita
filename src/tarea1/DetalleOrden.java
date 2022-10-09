package tarea1;

public class DetalleOrden{
    private int cantidad;

    public void calcPrecio(){
        return;
    }
    public void calcPrecioSinIVA(){
        return ;
    }
    public void calcIVA(){
        return ;
    }
    public void calcPeso(){
        return ;
    }

    public DetalleOrden(int cantidad){
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }   
}
