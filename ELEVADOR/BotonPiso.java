package ELEVADOR;

public class BotonPiso extends Boton{
   private int piso;
   public BotonPiso(int piso){
    this.piso = piso;
   }
   public int getpiso() {
    return piso;
   }
   @Override
   public void presionar() {
    super.presionar();
    System.out.println("Botón del piso " + piso + " presionado.");
   }
   } 
