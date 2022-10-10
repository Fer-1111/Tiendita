package tarea1;

public class DetalleOrden{
    private int cantidad;
    Articulo ar = new Articulo();

    public float calcPrecio(){
        return (float) (ar.getPrecio()+calcIVA())*cantidad;
    }
    public float calcPrecioSinIVA(){
        return ar.getPrecio()*cantidad;
    }
    public float calcIVA(){
        return (float) (ar.getPrecio()*0.19)*cantidad;
    }
    public float calcPeso(){
        return ar.getPeso();
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
