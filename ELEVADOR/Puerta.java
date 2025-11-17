package ELEVADOR;

public class Puerta {

    private boolean abierta = false;

    public void abrir() {
        if (!abierta) {
            abierta = true;
            System.out.println("Puerta abriéndose...");
        } else {
            System.out.println("La puerta ya está abierta.");
        }
    }

    public void cerrar() {
        if (abierta) {
            abierta = false;
            System.out.println("Puerta cerrándose...");
        } else {
            System.out.println("La puerta ya está cerrada.");
        }
    }

    public boolean estaAbierta() {
        return abierta;
    }
}

