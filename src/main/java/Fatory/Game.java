package Fatory;

public class Game {
    public static void main(String[] args) {
      Fabrica jogo = new JogoAdivinhacaoNumero("facil");
      jogo.jogar();
      jogo = new AdivinhaPaises("medio");
      jogo.jogar();
      jogo = new AdivinhaFrutas("dificil");
      jogo.jogar();

    }
}
