package Fatory;
import java.util.Scanner;

public abstract class Fabrica { // Classe Abstrata (CLASSE PAI PRINCIPAL) Em poucas palavras é a classe Fabrica do Fatory method
                                // A classe que poderíamos reutilizar e, muito importante, podemos usar de forma polimórfica,
                                // afinal, é a graça de manter a essência deste padrão desde o início.
    protected String dificuldade;
    protected int tentativas;
    protected Scanner sc;

    public Fabrica(String dificuldade){
        this.dificuldade = dificuldade;
        this.sc = new Scanner(System.in);

        switch (dificuldade) {
            case "facil" -> this.tentativas = 5;
            case "medio" -> this.tentativas = 3;
            case "dificil" -> this.tentativas = 1;
            default -> this.tentativas = 0;
        }

    }
    abstract void jogar(); // declarado como abstract, ele é parte de uma classe abstrata (nesse caso a nossa classe abstrata é FABRICA)
                            // Em Poucas palavras o metodo Jogar(), é o nosso Fatory Method(NOSSO METODO FABRICA)
    }
