package ELEVADOR;

public class Principal {
    public static void main(String[] args) throws InterruptedException {

        SistemaControl sistema = new SistemaControl(10);

        System.out.println("=== SIMULACIÓN DEL ELEVADOR DE 10 PISOS ===");
        System.out.println("Usuario en el piso 2 presiona el botón para SUBIR...");

        
        sistema.solicitarDesdePiso(2, ELEVADOR.Direccion.SUBIENDO);

        Thread.sleep(2000);
        sistema.ejecutar();

        System.out.println("\nSimulación finalizada.");
    }
}
