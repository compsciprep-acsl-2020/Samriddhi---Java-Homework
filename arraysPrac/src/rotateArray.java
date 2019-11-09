import java.io.FileNotFoundException;
import java.util.Arrays;

public class rotateArray {
    public static void main(String[] args) throws FileNotFoundException {
        int inp[] = {1,2,3};
        int first = inp[0];
        int finarray[] = new int[3];
        finarray[0] = inp[1];
        finarray[1] = inp[2];
        finarray[2] = inp[0];
        System.out.println(Arrays.toString(finarray));

    }
}
