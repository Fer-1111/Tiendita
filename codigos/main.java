package tarea1;

public class main {
    public static void main(String[] args) {
        OrdenCompra orden1 = new OrdenCompra();
        orden1.setFecha(10);
        orden1.setEstado("pendiente");
        
        Cliente cliente1 = new Cliente("Pedro","14.564.326-8");
        Direccion direccion1 = new Direccion("avenida macul");

    }
}
