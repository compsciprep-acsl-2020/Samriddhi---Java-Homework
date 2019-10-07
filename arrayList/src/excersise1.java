import java.util.ArrayList;
import java.util.List;

public class excersise1 {
    public static void main(String[] args) {
        List<String> words = new ArrayList<String>();
        words.add("words");
        words.add("word");
        words.add("bunny");
        words.add("bunnies");
        for (String w : words) {
            System.out.println(w);
        }

        for (String w : words) {
            if((w.substring(w.length()-1).equals("s"))){
                System.out.println(w.substring(0,w.length()-1) + "S");
            }
            else {
                System.out.println(w);
            }
        }


        for(int i = words.size()-1; i >= 0 ; i--){
            System.out.println(words.get(i));
        }

        int x = 0;
        for (String w : words) {
            if((w.substring(w.length()-1).equals("s"))) {
                x = 1;
            }
            else{
                System.out.println(w);
            }
        }



    }

    }
