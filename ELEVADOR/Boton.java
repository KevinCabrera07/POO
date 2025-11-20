package ELEVADOR;

public class Boton {
    private boolean presionado = false;

    public void presionar() {
        presionado = true;
        System.out.println("Botón presionado.");
    }

    public void resetear() {
        presionado = false;
    }

    public boolean estaPresionado() {
        return presionado;
   }
}
    

