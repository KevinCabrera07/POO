public class PrincipalProducto {
    public static void main(String[] args) {
        Producto p1 = new Producto("K070", "Camiseta", 3, 50000);
        System.out.println(p1.toString());

        p1.aplicarDescuento(10);
        p1.incrementarCantidad(2);

        System.out.println("\nProducto actualizado:");
        System.out.println(p1.toString());
    }
}