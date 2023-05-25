public class Main {
    public static void main(String[] args) {
        //Ala introdutoria de orientacao a objetos
        Pessoa anao = new Pessoa();

        //Declaração de obj
        Pessoa qualquer;

        //Instanciação do obj
        qualquer = new Pessoa();

        //Descrição do formarto pessoa qualuer
        qualquer.nome = "Raul";
        qualquer.sobrenome = "Zito";
        qualquer.falar();

        //Criar novos obj
        //Declarar obj
        Pessoa rainha;
        //É variavel(cima)

        //Instanciar obj
        rainha = new Pessoa();

        //Definir forma do obj
        rainha.nome = "Elisabeth";
        rainha.sobrenome = "Cadavér";

        //Definir comportamento do obj
        rainha.falar();
        System.out.println(rainha.falar("Alto"));



    }
}







