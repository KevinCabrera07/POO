package ELEVADOR;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ELEVADOR {

    enum Direccion { SUBIENDO, BAJANDO, QUIETO }

    private int pisoActual = 1;
    private Direccion direccion = Direccion.QUIETO;
    private boolean usuarioDentro = false;

    private Queue<Integer> destinos = new LinkedList<>();
    private Puerta puerta = new Puerta();
    private Scanner sc = new Scanner(System.in);

    public void solicitar(int pisoOrigen, Direccion dir) throws InterruptedException {
        System.out.println("Solicitud recibida desde el piso " + pisoOrigen + " (" + dir + ")");

        while (pisoActual != pisoOrigen) {
            if (pisoActual < pisoOrigen) {
                direccion = Direccion.SUBIENDO;
                System.out.println("elevador subiendo");
                pisoActual++;
            } else {
                direccion = Direccion.BAJANDO;
                System.out.println("elevador bajando");
                pisoActual--;
            }
            Thread.sleep(500);
        }

        System.out.println("El elevador ha llegado al piso " + pisoActual);
        llegar();
    }

    private void llegar() throws InterruptedException {
        Thread.sleep(700);
        puerta.abrir();

        if (!usuarioDentro) {
            // El usuario apenas entra
            System.out.println("Usuario entrando al elevador en el piso " + pisoActual);
            usuarioDentro = true;
            Thread.sleep(700);
            mostrarMenu();
        } else {
            // Usuario ya estaba dentro → ¿Este es su destino final?
            if (destinos.isEmpty()) {
                System.out.println("Usuario saliendo del elevador en el piso " + pisoActual);
                usuarioDentro = false;
                Thread.sleep(700);
                puerta.cerrar();
                return; // Termina aquí
            } else {
                mostrarMenu(); 
            }
        }

        puerta.cerrar();
    }

    private void mostrarMenu() throws InterruptedException {
        int opcion;

        do {
            System.out.println("\n===PANEL DEL ELEVADOR===");
            System.out.println("[1]Seleccionar piso destino");
            System.out.println("[2]Activar emergencia");
            System.out.println("[3]Salir del menú (continuar viaje)");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el piso destino: ");
                    int destino = sc.nextInt();
                    destinos.add(destino);
                    System.out.println("Piso " + destino + " agregado.");
                    break;

                case 2:
                    System.out.println("¡Emergencia activada! Elevador detenido.");
                    destinos.clear();
                    return;

                case 3:
                    System.out.println("Continuando viaje...");
                    return;  // El usuario NO sale aquí, solo sale del menú
            }

        } while (opcion != 3);
    }

    public void iniciarViaje() throws InterruptedException {

        while (!destinos.isEmpty()) {
            int destino = destinos.poll();

            System.out.println("\nElevador desplazándose hacia el piso " + destino + "...");

            while (pisoActual != destino) {
                if (pisoActual < destino) {
                    direccion = Direccion.SUBIENDO;
                    System.out.println("elevador subiendo");
                    pisoActual++;
                } else {
                    direccion = Direccion.BAJANDO;
                    System.out.println("elevador bajando");
                    pisoActual--;
                }
                Thread.sleep(500);
            }

            System.out.println("El elevador ha llegado al piso " + pisoActual);
            llegar();  // Aquí se verifica si el usuario sale
        }

        System.out.println("\nSimulación finalizada.");
    }
}