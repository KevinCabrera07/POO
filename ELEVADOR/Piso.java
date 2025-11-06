package ELEVADOR;

public class Piso {
    private int numero;
    private Boton botonSubir = new Boton();
    private Boton botonBajar = new Boton();

    public Piso(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void solicitarSubir() {
        botonSubir.presionar();
        System.out.println("Solicitud para subir desde el piso " + numero);
    }

    public void solicitarBajar() {
        botonBajar.presionar();
        System.out.println("Solicitud para bajar desde el piso " + numero);
    }
}
