import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        //Creación del Objeto
        Libro objLibro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 2000);
        Libro objLibro2 = new Libro("Ser Digital", "Nicolás Negroponte", 2005);
        
        System.out.println(objLibro1); 

        System.out.println(objLibro2); 
       
        System.out.println("Autor: " + objLibro1.getAutor()); 

       
        System.out.println("Año publicación: " + objLibro2.getAnioPublicacion()); 
        
        
        objLibro1.setTitulo("El Coronel No Tiene Quién Le Escriba");
        
        
        System.out.println(objLibro1); 

        System.out.println("Título: " + objLibro1.getTitulo()); 
        
    }
}