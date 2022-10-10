package tarea1;

public class Cliente {
    private String nombre;
    private String rut;

    @Override
    public String toString() {
        return "nombre=" + nombre + ", rut=" + rut;
    }

    public Cliente(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    } 
}

class Direccion{
    private String direccion;

    public Direccion(String direccion) {
        this.direccion = direccion;
    }
    
    @Override
    public String toString() {
        return "direccion=" + direccion;
    }  
}
