public class Pessoa extends Animal {
    //Atributos da pessoa

    public String sobrenome;
    //Métodos de classe
    public void falar() {

        System.out.println("Amo");
    }

    //Sobrecarga do método falar()
    public String falar(String volume){
        return "Amo boku no pico" + volume;
    }

    //Sobrescrita do método
    public void comer(){
        System.out.println("Comeu como pessoa");

    }

}
