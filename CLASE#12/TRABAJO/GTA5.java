package TRABAJO;

public class GTA5 extends Videojuego {
     public GTA5(String consola){
     super("GTA 5", consola);
    }
    @Override
    public void jugar(){
        System.out.println("Disfruta de este juego a mundo abierto y haz todas las misiones en la" + consola);
    }
}
