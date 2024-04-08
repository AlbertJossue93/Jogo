package Fatory;
import java.util.InputMismatchException;

public class JogoAdivinhacaoNumero extends Fabrica {
    public JogoAdivinhacaoNumero(String dificuldade) {
        super(dificuldade);
    }

    @Override
    void jogar() {
        int numeroSecreto;
        int numeroCorreto;
        numeroSecreto = (int) (Math.random() * 10) + 1; // numero aleatorio entre 1 e 10

        System.out.println("=======================================================");

        System.out.println("      Welcome to Our Guessing Game!");

        System.out.println("=======================================================");

        System.out.println("Adivinhe um numero de 1 ao 10 para acertar (Voce tem 5 tentativas) ");

            while (tentativas > 0) {
                try {
                    System.out.println("Digite um numero de 1 ao 10: ");
                    numeroCorreto = sc.nextInt();
                    if (numeroCorreto == numeroSecreto) {
                        System.out.println("CONGRATULATIONS YOU WON ! O NUMERO CORRETO ERA " + numeroSecreto);
                        return;
                    } else {
                        tentativas--;
                        System.out.println("TRY AGAIN!! RESTAM " + tentativas + " tentativas");
                    }
                    }catch(InputMismatchException e){
                        System.out.println("PLEASE!, digite um valor numerico. ");
                        sc.nextLine();
                    }

                }

        System.out.println("YOU LOST !! , voce nao conseguiu acertar o numero correto e suas tentativas acabaram o numero correto era " + numeroSecreto);
      }
    }



