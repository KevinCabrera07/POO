import java.util.Date;
public class EjecutarPedido {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("115470", "Kevin Cabrera");

        Foto[] fotos = {
            new Foto("Paisaje.jpg"),
            new Foto("Hijos.png"),
            new Foto("Animales.jpeg")
        };

        Producto p1 = new Camara(1, "Sony Alpha 7", " Alpha 7");
        Producto p2 = new Impresion(2, "Color", fotos);

        Producto[] listaProductos = { p1, p2 };

        Pedido pedido = new Pedido(c1, listaProductos, new Date(), 987654321);
        pedido.mostrarPedido();
    }
}