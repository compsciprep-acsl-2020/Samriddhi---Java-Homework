import java.util.*;
public class decimalToBinary {
    public static void main(String[] args){
        //8 4 2 1
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String fin = "";
        while(num != 1){
            int ad = num%2;
            num = num/2;
            fin = fin+ad;
        }
        fin = "1" + fin;
        System.out.println(fin);

    }
}
