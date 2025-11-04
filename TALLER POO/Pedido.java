import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class Pedido {
    private Cliente cliente;
    private Producto[] productos;
    private Date fecha;
    private int numeroTarjetaCredito;

    public Pedido(Cliente cliente, Producto[] productos, Date fecha, int numeroTarjetaCredito) {
        this.cliente = cliente;
        this.productos = productos;
        this.fecha = fecha;
        this.numeroTarjetaCredito = numeroTarjetaCredito;
    }
    public void mostrarPedido() {
    
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy", new Locale("es", "ES"));
        String fechaFormateada = formato.format(fecha);

        System.out.println("=== Pedido ===");
        System.out.println("Cliente: " + cliente);
        System.out.println("Fecha: " + fechaFormateada);
        System.out.println("Tarjeta: " + numeroTarjetaCredito);
        System.out.println("Productos:");
        for (Producto p : productos) {
            System.out.println("  - " + p);
        }
    }
}
