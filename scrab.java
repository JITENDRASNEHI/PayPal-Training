import java.util.Arrays;
import java.util.HashSet;

public class scrab {

    public HashSet<String> subsequence(String s) {

        String str = sortRev(s);

        HashSet<String> st = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {

            for (int j = str.length(); j > i; j--) {
                String sub_str = str.substring(i, j);

                if (!st.contains(sub_str))
                    st.add(sub_str);

                for (int k = 1; k < sub_str.length() - 1; k++) {
                    StringBuffer sb = new StringBuffer(sub_str);

                    sb.deleteCharAt(k);
                    if (!st.contains(sb))
                        ;
                    subsequence(sb.toString());
                }
            }
        }
        return st;
    }

    public String bestWord (String s){
        HashSet<String> subSeq = subsequence(s);

        for (String str : subSeq){
            if (!str.isEmpty()){
                //call checkValidity
                //get max
                //return max
                System.out.println(str);
            }
        }
        return null;
    }

    public String sortRev (String s){
        char strArray[] =  s.toCharArray();
        Arrays.sort(strArray);
        return String.valueOf(strArray);
    }

    public static void main(String args[]){
        scrab s = new scrab();
//        System.out.println(s.sortRev("bca"));
        System.out.print(s.bestWord("bacdef"));
    }

}
