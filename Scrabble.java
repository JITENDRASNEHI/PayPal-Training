package PayPalTraining;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;

public class Scrabble {
    HashMap<String,ArrayList<String>> dictionary = new HashMap<String,ArrayList<String>>();


    void generateDict() throws Exception{
        String FILE = "/Users/jsnehi/Downloads/sowpods.txt";
        BufferedReader br = new BufferedReader(new FileReader(FILE));

            String str;
            while((str=br.readLine())!=null){
                char temp[] = str.toCharArray();
                Arrays.sort(temp);
                String anagram = new String(temp);
                if(dictionary.containsKey(anagram)){
                    ArrayList<String> as = dictionary.get(anagram);
                    as.add(str);
                    dictionary.put(anagram,as);
                }else{
                    ArrayList<String> as = new ArrayList<String>();
                    as.add(str);
                    dictionary.put(anagram,as);
                }


        }
    }
    String checkValidity(String key){

        if(dictionary.containsKey(key)){return dictionary.get(key).get(0);}
        return null;
    }

    String checkValidityPos(String key, int pos, char a){

        if(dictionary.containsKey(key)){
            List<String> temp = dictionary.get(key);
            for(String t: temp){
                if(t.charAt(pos)==a)return t;
            }
        }
        return null;
    }
}
