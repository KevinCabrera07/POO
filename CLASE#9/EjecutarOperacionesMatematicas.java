import java.util.Scanner;

public class EjecutarOperacionesMatematicas {
    public static void main(String[] args) {
        // Clase Scanner para leer datos por teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Digite el segundo numero: ");
        int b = sc.nextInt();

        OperacionesMatematicas objOp = new OperacionesMatematicas(a, b);

        System.out.println("El resultado de la suma es: " + objOp.sumar());
        System.out.println("El resultado de la resta es: " + objOp.restar());
        System.out.println("El resultado de la multiplicacion es: " + objOp.multiplicar());
        System.out.println("El resultado de la division es: " + objOp.dividir());

        // menú de opciones (solo una vez)
        int option;
        do {
            System.out.println("\n--- MENÚ DE OPERACIONES ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Elevar al cuadrado");
            System.out.println("6. Elevar al cubo");
            System.out.println("7. Elevar a la n");
            System.out.println("8. Raíz cuadrada");
            System.out.println("9. Raíz cúbica");
            System.out.println("10. Raíz n");
            System.out.println("0. Salir");
            System.out.print("Elija una opción: ");
            option = sc.nextInt();

            switch (option) {
                case 1 -> System.out.println("Resultado: " + objOp.sumar());
                case 2 -> System.out.println("Resultado: " + objOp.restar());
                case 3 -> System.out.println("Resultado: " + objOp.multiplicar());
                case 4 -> System.out.println("Resultado: " + objOp.dividir());
                case 5 -> System.out.println("Resultado: " + objOp.elevarAlCuadrado());
                case 6 -> System.out.println("Resultado: " + objOp.elevarAlCubo());
                case 7 -> System.out.println("Resultado: " + objOp.elevarAN());
                case 8 -> System.out.println("Resultado: " + objOp.raizCuadrada());
                case 9 -> System.out.println("Resultado: " + objOp.raizCubica());
                case 10 -> System.out.println("Resultado: " + objOp.raizN());
                case 0 -> System.out.println("Saliendo.");
                default -> System.out.println("Opción inválida. Digite de nuevo.");
            }

        } while (option != 0);

        sc.close();
    }
}
