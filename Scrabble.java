package PayPalTraining;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.HashMap;

public class Scrabble {
    HashMap<String,String> dictionary = new HashMap<String,String>();


    void generateDict() throws Exception{
        String FILE = "/Users/jsnehi/Downloads/sowpods.txt";
        BufferedReader br = new BufferedReader(new FileReader(FILE));

            String str;
            while((str=br.readLine())!=null){
                char temp[] = str.toCharArray();
                Arrays.sort(temp);
                String anagram = new String(temp);
                dictionary.put(anagram,str);

        }
    }
    String checkValidity(String key){

        if(dictionary.containsKey(key)){return dictionary.get(key);}
        return null;
    }
}
