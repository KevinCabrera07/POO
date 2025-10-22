public class EjecutarHerenciaAnimal {

    public static void main(String[] args) {
        Animal soud = new Gato();
        Animal paco = new Perro();

        paco.hacerSonido();
        soud.hacerSonido();

    }
}
