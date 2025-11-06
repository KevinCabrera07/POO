package ELEVADOR;
public class Direccion {
    public static final Direccion SUBIENDO = new Direccion();
    public static final Direccion BAJANDO = new Direccion();
    public static final Direccion DETENIDO = new Direccion();

    private Direccion() {}
}