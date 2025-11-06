package ELEVADOR;

public class Puerta {
    private boolean abierta = false;

    public void abrir() throws InterruptedException {
        if (!abierta) {
            System.out.println("Abriendo puertas...");
            Thread.sleep(700);
            abierta = true;
        }
    }

    public void cerrar() throws InterruptedException {
        if (abierta) {
            System.out.println("Cerrando puertas...");
            Thread.sleep(700);
            abierta = false;
        }
    }

    public boolean estaAbierta() {
        return abierta;
    }
}
