package ELEVADOR;

public class Piso {

    private int numero;
    private BotonPiso botonSubir;
    private BotonPiso botonBajar;

    public Piso(int numero) {
        this.numero = numero;
        botonSubir = new BotonPiso(numero);
        botonBajar = new BotonPiso(numero);
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