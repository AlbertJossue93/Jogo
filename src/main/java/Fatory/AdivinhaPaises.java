package Fatory;

public class AdivinhaPaises extends Fabrica {
    public AdivinhaPaises(String dificuldade){
        super(dificuldade);
    }

    @Override
    void jogar() {
        String [] paises = new String[]{"australia", "alemanha", "arabia saudita", "belgica", "brasil", "bolivia", "china", "chile", "canada"};
        String p = paises[(int)(Math.random() * paises.length)];

        System.out.println("=======================================================");

        System.out.println("        Welcome to the Country Guessing Game!");

        System.out.println("=======================================================");
        System.out.println(" Tenta Adivinhar qual é o pais secreto (VOCE TEM 3 TENTATIVAS )  ");

        while (tentativas > 0) {
            System.out.print("Digite um pais: ");
            for (String s : new String[]{sc.nextLine()}) {
                if (p.equals(s)) {
                    System.out.println("CONGRATULATIONS YOU WON ! Você acertou a palavra.");
                    return;
                } else {
                    tentativas--;
                    System.out.println("TRY AGAIN!!. Restam " + tentativas + " tentativas.");
                }
              }
            }

        System.out.println("YOU LOST !!. A palavra correta era: " + p);
    }
}