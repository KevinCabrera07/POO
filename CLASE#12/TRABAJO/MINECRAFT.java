package TRABAJO;

public class MINECRAFT extends Videojuego {

public MINECRAFT(String consola){
        super("Minecraft", consola);
    }

    @Override
    public void jugar(){
        System.out.println("Aventurate y disfruta de este juego en la" + consola);
    }
}
