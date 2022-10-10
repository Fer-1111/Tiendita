package tarea1;

import java.util.Date;

public abstract class DocTributario {
    OrdenCompra comprobante = new OrdenCompra();
    private String numero;

    public OrdenCompra getComprobante() {
        return comprobante;
    }

    public void setComprobante(OrdenCompra comprobante) {
        this.comprobante = comprobante;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    private String rut;
    private int fecha;
}

class Boleta extends DocTributario{

    public OrdenCompra getComprobante() {
        return comprobante;
    }

    public void setComprobante(OrdenCompra comprobante) {
        this.comprobante = comprobante;
    }

}
class Factura extends DocTributario{

    public OrdenCompra getComprobante() {
        return comprobante;
    }

    public void setComprobante(OrdenCompra comprobante) {
        this.comprobante = comprobante;
    }
    
}
