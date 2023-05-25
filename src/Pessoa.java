public class Pessoa {
    //Atributos da pessoa
    public String nome;

    public String sobrenome;
    //Métodos de classe
    public void falar() {

        System.out.printf("Amo crianças");
    }

    //Sobrecarga do método falar()
    public String falar(String volume){
        return "Falei" + volume;
    }




}
