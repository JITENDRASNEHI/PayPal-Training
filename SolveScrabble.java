package PayPalTraining;
import java.util.Arrays;
import java.util.HashSet;

public class SolveScrabble {
    public static final int[] score_of_letter = { 1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};

    static int score(String word){
        if(word==null) return 0;
        int score=0;
        for(int i=0;i<word.length();i++){
           // System.out.print(score +"  "+word.charAt(i)+"  ");
            score += score_of_letter[word.charAt(i)-'A'];
           // System.out.println(score);
        }
        return score;
    }


    public static void main(String args[]) throws Exception{
        Scrabble game = new Scrabble();
        game.generateDict();
        scrab subSeq = new scrab();
        subSeq.subsequence("DO");
        int MaxScore = Integer.MIN_VALUE;
        String ans = "";
        for(String temp : scrab.st){
            if(game.checkValidity(temp)!=null){
                if(MaxScore<score(temp)){
                    MaxScore=score(temp);
                    ans = game.checkValidity(temp);
                }
            }
        }
        System.out.println("without wildcard " + ans);

        System.out.print("with wildcard " + wildcardScrabble(game));


    }

    static String sortRev (String s){
        char strArray[] =  s.toCharArray();
        Arrays.sort(strArray);
        return String.valueOf(strArray);
    }

    static String wildcardScrabble(Scrabble game){
        int MaxScore = Integer.MIN_VALUE;
        String ans = "";

        for (char i = 'A'; i<='Z'; i++){
            for(String temp : scrab.st){
                if(game.checkValidity(sortRev(temp+i))!=null){
                    if(MaxScore<score(temp+i)){
                        MaxScore=score(temp+i);
                        ans = game.checkValidity(sortRev(temp+i));
                    }
                }
            }
        }
        return ans;
    }

}
