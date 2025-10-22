public class Persona {
    // Atributos
    private String identificacion;
    private String nombres;
    private String apellidos;
    private int edad;
    private double estatura;
    private double peso;

    // Constructor
    public Persona(String identificacion, String nombres, String apellidos, int edad, double estatura, double peso) {
        this.identificacion = identificacion;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
    }

    // Métodos
    public void caminar() {
        System.out.println("Caminar");
    }
    public boolean jugar() {
        return true;
    }
    public void comer() {
        System.out.println("Comer");
    }
    public String estudiar(String carrera) {
        return nombres + " está estudiando " + carrera;
    }
    //implementacion getter y setter
    
    public String getIdentificacion() {
        return identificacion;
    }
    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getEstatura() {
        return estatura;
    }
    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
}
