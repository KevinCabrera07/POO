public class OperacionesMatematicas {
    //atributos
    private int numero1;
    private int numero2;

    //Metodo constructor de la clase:permite inicializar la clase
    //tiene el mismo nombre de la clase
    //*firma del metodo constructor
    public OperacionesMatematicas(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    //Metodos
    public int sumar() {
        return numero1 + numero2;
    }

    public int restar() {
        return numero1 - numero2;
    }
    public int multiplicar() {
        return numero1 * numero2;
    }
    public double dividir(){
        double resultado = 0.0;
        if(numero2==0){
            resultado = 0.0;
        }else{
            resultado=(double)numero1/(double)numero2;//convertir un entero a real
        }
        return resultado;
    }
// MÉTODOS DE LA TAREA
// Elevar al cuadrado
 public double elevarAlCuadrado() {
 return Math.pow(numero1, 2);
   }
// Elevar al cubo
   public double elevarAlCubo() {
   return Math.pow(numero1, 3);
    }
// Elevar a la n
public double elevarAN() {
return Math.pow(numero1, numero2);
  }
 // Raíz cuadrada
public double raizCuadrada() {
return Math.sqrt(numero1);
   }

// Raíz cúbica
public double raizCubica() {
return Math.cbrt(numero1);
}
// Raíz n
 public double raizN() {
return Math.pow(numero1, 1.0 / numero2);  }
 }
