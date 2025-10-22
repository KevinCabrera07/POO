package TRABAJO;
public class DemoJuegos {
    public static void main(String[] args) {

        Videojuego juego1 = new GTA5("PC GAMER");
        Videojuego juego2 = new FC25("Play Station 5");
        Videojuego juego3 = new MINECRAFT("Play Station 3");

        juego1.jugar();
        juego2.jugar();
        juego3.jugar();

        System.out.println("\nInformación de los juegos:");
        juego1.informacion();
        juego2.informacion();
        juego3.informacion();
    }
}