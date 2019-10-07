import java.util.ArrayList;

public class evenFibonacci {
    public static void main(String[] args) {
        ArrayList<Integer> fibs = new ArrayList<Integer>();
        int num = 0;
        fibs.add(1);
        fibs.add(2);
        while(fibs.get(fibs.size()-1) <= 4000000){
            int ad = (fibs.size()-2 + fibs.size()-1);
            fibs.add(ad);
        }
        System.out.println(fibs);
        for(int i = 0; i < fibs.size()-1; i++){
            if(fibs.get(i) % 2 == 0){
                num = num + fibs.get(i);
            }

        }
        System.out.println(num);
    }
}
