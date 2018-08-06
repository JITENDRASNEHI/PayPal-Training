public class SolveScrabble {
    public static void main(String args[]) throws Exception{
        Scrabble game = new Scrabble();
        game.generateDict();
        System.out.print(game.checkValidity("DGO"));

    }
}
