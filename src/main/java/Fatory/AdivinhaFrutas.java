package Fatory;


public class AdivinhaFrutas  extends Fabrica {
    public AdivinhaFrutas(String dificuldade) {
        super(dificuldade);
    }

    @Override
    void jogar() {
        String[] frutas = new String[]{"abacaxi", "amora", "açerola", "banana", "baru", "maça", "maracuja", "manga", "laranja", "limao"};
        String dica = "Frutas que começam com as iniciais (A),(B),(M),(L)";
        String f = frutas[(int) (Math.random() * frutas.length)];

        System.out.println("=======================================================");
        System.out.println("        Welcome to the Fruit Guessing Game!");
        System.out.println("=======================================================");
        System.out.println(" Tenta Adivinhar qual é a Fruta (VOCE TEM SÓ 1 TENTATIVA ) ");

        System.out.println("DICA: " + dica);
        while (tentativas > 0) {
            System.out.print("Digite uma fruta: ");
            for (String r :  new String[]{sc.nextLine()}) {
                    if (f.equals(r)) {
                        System.out.println("CONGRATULATIONS YOU WON ! Você acertou a palavra.");
                        return;
                    } else {
                        tentativas--;
                        System.out.println("YOU LOST !!. A fruta correta era: " + f);
                      }

                  }
               }

            }
    }


