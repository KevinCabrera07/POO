package TRABAJO;

public class FC25 extends Videojuego {
 public FC25(String consola){
 super("FC 25", consola);
 }
 @Override
 public void jugar(){
 System.out.println("Juega los distintos modos de futbol en la" + consola);
 }
}
