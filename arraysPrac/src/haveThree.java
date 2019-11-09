import java.io.FileNotFoundException;

public class haveThree {
    public static void main(String[] args) throws FileNotFoundException {
        int inp[] = {3,3,1,1,3};
        int count = 0;
        for(int i : inp){
            if(i == 3){
                count = count + 1;
            }
    }
        if(count != 3){
            System.out.println(false);
        }
        else{
            boolean check = true;
            for(int i = 0; i < inp.length-1; i++){
                if(inp[i] == 3 && inp[i+1] == 3){
                    check = false;
                }

            }
            System.out.println(check);
        }
}
    }
