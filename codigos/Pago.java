package tarea1;

import java.util.Date;

public abstract class Pago{
    private float monto;
    private Date fecha;

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public float getMonto() {
        return monto;
    }
}

class Efectivo extends Pago{
    
    public float calcDevolucion(float dinero){
        return dinero - super.getMonto();
    }
}

class Transferencia extends Pago{
    private String banco;

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    private String numCuenta;   
}

class Tarjeta extends Pago{
    private String tipo;
    private String numTransaccion;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNumTransaccion() {
        return numTransaccion;
    }

    public void setNumTransaccion(String numTransaccion) {
        this.numTransaccion = numTransaccion;
    }
}
