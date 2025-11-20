package ELEVADOR;

public class BotonElevador extends Boton {
    private int pisoDestino;
    public BotonElevador(int pisoDestino) {
        this.pisoDestino= pisoDestino;
    }
    public int getpisoDestino() {
        return pisoDestino;
    }
    @Override
    public void presionar() {
        super.presionar();
        System.out.println("Botón del piso " + pisoDestino + " presionado adentro del Elevador.");
    }

}
