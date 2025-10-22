public class Producto {
    // Atributos
    private String codigo;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    // Constructor por defecto
    public Producto() {
        codigo = "000";
        descripcion = "Sin descripción";
        cantidad = 1;
        precioUnitario = 0;
    }

    // Constructor parametrizado
    public Producto(String codigo, String descripcion, int cantidad, double precioUnitario) {
        this.codigo = (!codigo.isEmpty()) ? codigo : "000";
        this.descripcion = (!descripcion.isEmpty()) ? descripcion : "Sin descripción";
        this.cantidad = (cantidad >= 1) ? cantidad : 1;
        this.precioUnitario = (precioUnitario >= 0) ? precioUnitario : 0;
    }

    // Métodos principales
    public double calcularSubtotal() {
        return cantidad * precioUnitario;
    }

    public void aplicarDescuento(double porcentaje) {
        if (porcentaje > 0 && porcentaje <= 50) {
            double total = calcularSubtotal() * (1 - porcentaje / 100);
            System.out.println("Total con " + porcentaje + "% de descuento: " + total);
        } else {
            System.out.println("Descuento inválido.");
        }
    }

    public void incrementarCantidad(int valor) {
        if (valor > 0) cantidad += valor;
    }

    public String toString() {
        return "Código: " + codigo + ", Descripción: " + descripcion +
               ", Cantidad: " + cantidad + ", Precio: " + precioUnitario +
               ", Subtotal: " + calcularSubtotal();
    }
}