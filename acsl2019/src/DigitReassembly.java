import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DigitReassembly {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("/Users/samriddhikumar/IdeaProjects/Samriddhi---Java-Homework/acsl2019/src/DigitReassemblyInputs"));
        while(scan.hasNext()) {
            String inpp = scan.nextLine();
            String inps[] = inpp.split(" ");
            String inp = inps[0];
            int n = Integer.parseInt(inps[1]);
            int num = inp.length() - n;
            long fin = 0;
            for (int i = 0; i <= num; i++) {
                String s = inp.substring(i, i + n);
                fin = fin + Long.parseLong(s);
            }
            System.out.println(fin);

        }
    }
}
