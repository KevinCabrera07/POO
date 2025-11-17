package ELEVADOR;

public class SistemaControl {

    private Piso[] pisos;
    private ELEVADOR elevador;

    public SistemaControl(int cantidadPisos) {
        pisos = new Piso[cantidadPisos];
        for (int i = 0; i < cantidadPisos; i++) {
            pisos[i] = new Piso(i);
        }
        elevador = new ELEVADOR();
    }

    public void solicitarDesdePiso(int numeroPiso, ELEVADOR.Direccion dir) throws InterruptedException {
        // Llamamos al nuevo método solicitar()
        elevador.solicitar(numeroPiso, dir);
    }

    public void ejecutar() throws InterruptedException {
        // Ahora se llama iniciarViaje()
        elevador.iniciarViaje();
    }

    public void activarEmergencia() {
        System.out.println("EMERGENCIA: la función aún no está implementada en la nueva clase Elevador");
    }
}

