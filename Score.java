package ScrabbleProblem;

public class Score {
	
	
//	score = {"a": 1, "c": 3, "b": 3, "e": 1, "d": 2, "g": 2, 
//	         "f": 4, "i": 1, "h": 4, "k": 5, "j": 8, "m": 3, 
//	         "l": 1, "o": 1, "n": 1, "q": 10, "p": 3, "s": 1, 
//	         "r": 1, "u": 1, "t": 1, "w": 4, "v": 4, "y": 4, 
//	         "x": 8, "z": 10}
//	
	
//	0 Points - Blank tile.
//
//	1 Point - A, E, I, L, N, O, R, S, T and U.
//
//	2 Points - D and G.
//
//	3 Points - B, C, M and P.
//
//	4 Points - F, H, V, W and Y.
//
//	5 Points - K.
//
//	8 Points - J and X.
//
//	10 Points - Q and Z.
	
	public static final int[] score_of_letter = { 1,3,3,2,1,4,2,4,1,8,5,1,3,1,1,3,10,1,1,1,1,4,4,8,4,10};
	
	public static final char[] sorted_letters = { 'u','t','s','r','o','n','l','i','e','a','g','d','p','m','b','c','y','w','v','h','f','k','j','x','q','z'
};
			
	String remove_letter(String word){
		for(int i=0;i<sorted_letters.length;i++){
			if(word.contains(to_String(sorted_letters[i])));
		}
	}
	
	int score(String word){
		if(word==null) return 0;
		int score=0;
		for(int i=0;i<word.length();i++){
			System.out.print(score +"  "+word.charAt(i)+"  ");
			score += score_of_letter[word.charAt(i)-'a'];
			System.out.println(score);
		}
		return score;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String temp="'z','q','x','j','k','f','h','v','w','y','c','b','m','p','d','g','a','e','i','l','n','o','r','s','t','u'";
		System.out.println(temp.);
		Scrabble sc = new Scrabble();
		System.out.println(sc.score("oxyphenbutazone"));
	}

}
