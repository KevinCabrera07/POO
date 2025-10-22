public class EjecutarPersona {
    public static void main(String[] args) {
        
        //Creación del objeto
        //El operador "new" me permite instanciar(crear) el objeto
        Persona objPersona1 = new Persona("1006234", 
                                            "Juan David", 
                                            "Perez Lópera", 
                                            23, 
                                            1.80, 
                                            70.3);

        Persona objPersona2 = new Persona("123408",
                                            "Samuel Stiven", 
                                            "Arce Gómez", 
                                            17, 
                                            1.84, 
                                            65.0);
       Persona objPersona3 = new Persona("127474",
                                            "Andres Manuel", 
                                            "Lopez Martinez", 
                                            19, 
                                            1.78, 
                                            67.0);
        System.out.println(objPersona2.estudiar("Psicología"));                            
        System.out.println(objPersona2.estudiar("Ingeniería de Sistemas"));
        System.out.println(objPersona3.estudiar("Medicina"));

        //implementacion getter y setter
          System.out.println("Nombre persona 1: " + objPersona1.getNombres());
        System.out.println("Edad persona 1: " + objPersona1.getEdad());
        objPersona1.setEdad(24);
        objPersona1.setPeso(72.5);
         System.out.println("Nueva edad de " + objPersona1.getNombres() + ": " + objPersona1.getEdad());
        System.out.println("Nuevo peso de " + objPersona1.getNombres() + ": " + objPersona1.getPeso());

        //2
          System.out.println("Nombre persona 2: " + objPersona2.getNombres());
        System.out.println("Edad persona 2: " + objPersona2.getEdad());
        objPersona2.setEdad(18);
        objPersona2.setPeso(65.0);
         System.out.println("Nueva edad de " + objPersona2.getNombres() + ": " + objPersona2.getEdad());
        System.out.println("Nuevo peso de " + objPersona2.getNombres() + ": " + objPersona2.getPeso());
        //3
          System.out.println("Nombre persona 3: " + objPersona3.getNombres());
        System.out.println("Edad persona 3: " + objPersona3.getEdad());
        objPersona3.setEdad(20);
        objPersona3.setPeso(68.0);
         System.out.println("Nueva edad de " + objPersona3.getNombres() + ": " + objPersona3.getEdad());
        System.out.println("Nuevo peso de " + objPersona3.getNombres() + ": " + objPersona3.getPeso());     


        
    }
}