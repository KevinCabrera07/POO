public class PracticaCondicionales {
    public static void main(String[] args) {
        //----------------- 4.1 A
        int angulo = 90;
        if (angulo == 90) {
            System.out.println("El ángulo es un ángulo recto");
        } else {
            System.out.println("El ángulo no es un ángulo recto");
        }
        //-----------------B
        double temperatura = 100.0;
        if (temperatura > 100) {
            System.out.println("Por encima del punto de ebullición del agua");
        } else {
            System.out.println("Por debajo del punto de ebullición del agua");
        }
        //-----------------C
        int numero = -5;
        int totalPositivos = 0;
        int totalNegativos = 0;
        if (numero >= 0) {
            totalPositivos += numero;
        } else {
            totalNegativos += numero;
        }
        System.out.println("Total positivos: " + totalPositivos);
        System.out.println("Total negativos: " + totalNegativos);

        //-----------------D
        int x = 10, y = 5, z = 15;
        int p;
        if (x > y && z < 20) {
            p = 100;
            System.out.println("Se leyó el valor de p: " + p);
        } else {
            System.out.println("No se cumplen las condiciones para leer p");
        }

        //-----------------E
        int distancia = 25;
        int tiempo;
        if (distancia > 20 && distancia < 35) {
            tiempo = 10;
            System.out.println("Se leyó el valor de tiempo: " + tiempo);
        } else {
            System.out.println("Distancia fuera del rango.");
        }

        //----------------- 4.2
        int num1 = 10;
        int num2 = 20;
        if (num1 > num2) {
            System.out.println("El primer número es el mayor.");
        } else if (num1 < num2) {
            System.out.println("El primer número es el más pequeño.");
        } else {
            System.out.println("Ambos números son iguales.");
        }

        //-----------------4.3
        int n1 = 15, n2 = 25, n3 = 20;
        int central;
        if ((n1 > n2 && n1 < n3) || (n1 < n2 && n1 > n3)) {
            central = n1;
        } else if ((n2 > n1 && n2 < n3) || (n2 < n1 && n2 > n3)) {
            central = n2;
        } else {
            central = n3;
        }
        System.out.println("El número central es: " + central);

        //-----------------4.4
        double num = 25;
        if (num >= 0) {
            double raiz = Math.sqrt(num);
            System.out.println("La raíz cuadrada es: " + raiz);
        } else {
            System.out.println("No se puede calcular la raíz de un número negativo.");
        }

        //-----------------4.5
        int valor = 8;
        if (valor % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }

        //-----------------4.6
        int dia = 28, mes = 8, año = 2025;
        dia++;
        if (dia > 30) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                año++;
            }
        }
        System.out.println("La fecha del día siguiente es: " + dia + "/" + mes + "/" + año);

        //-----------------4.7
        double peso = 45;
        if (peso < 40) {
            System.out.println("Alumno de menos de 40 kg");
        } else if (peso <= 50) {
            System.out.println("Alumno entre 40 y 50 kg");
        } else if (peso < 60) {
            System.out.println("Alumno entre 50 y 60 kg");
        } else {
            System.out.println("Alumno de 60 kg o más");
        }
        //-----------------4.8
        int a1 = 12, b1 = 4;
        if (a1 % b1 == 0) {
            System.out.println(b1 + " es divisor de " + a1);
        } else if (b1 % a1 == 0) {
            System.out.println(a1 + " es divisor de " + b1);
        } else {
            System.out.println("Ninguno es divisor del otro.");
        }

        //-----------------4.9
        int a = 90;
        if (a < 90) {
            System.out.println("Ángulo Agudo");
        } else if (a > 90) {
            System.out.println("Ángulo Obtuso");
        } else {
            System.out.println("Ángulo Recto");
        }

        //-----------------4.10
        int calificacionNumerica = 87;
        char calificacionLetra;
        if (calificacionNumerica >= 90) {
            calificacionLetra = 'A';
        } else if (calificacionNumerica >= 80) {
            calificacionLetra = 'B';
        } else if (calificacionNumerica >= 70) {
            calificacionLetra = 'C';
        } else if (calificacionNumerica >= 69) {
            calificacionLetra = 'D';
        } else {
            calificacionLetra = 'F';
        }
        System.out.println("La calificación en letra es: " + calificacionLetra);

        //-----------------4.11
        double n11 = 12, n22 = 4;
        char seleccionOp = '+'; // puede ser '+', '-', '*', '/'
        switch (seleccionOp) {
            case '+':
                System.out.println("Suma: " + (n11 + n22));
                break;
            case '-':
                System.out.println("Resta: " + (n11 - n22));
                break;
            case '*':
                System.out.println("Multiplicación: " + (n11 * n22));
                break;
            case '/':
                if (n22 != 0) {
                    System.out.println("División: " + (n11 / n22));
                } else {
                    System.out.println("Error: división por cero");
                }
                break;
            default:
                System.out.println("Operación no válida");
        }
        //-----------------4.12
        double numA = 10.0, numB = 5.0;
        int codigo = 3;
        if (codigo == 1) {
            System.out.println("Suma: " + (numA + numB));
        } else if (codigo == 2) {
            System.out.println("Multiplicación: " + (numA * numB));
        } else if (codigo == 3) {
            if (numB != 0) {
                System.out.println("División: " + (numA / numB));
            } else {
                System.out.println("Error: división por cero");
            }
        } else {
            System.out.println("Código de selección no válido.");
            
        }
    }
}
