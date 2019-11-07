import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class StudentIdProgram {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new File("/Users/samriddhikumar/IdeaProjects/Samriddhi---Java-Homework/practice/src/StudentIdInputs"));
        ArrayList<Student> stus = new ArrayList<Student>();
        while(scan.hasNextLine()) {
            String inp = scan.nextLine();
            String inps[] = inp.split("#");
            Student stu = new Student(inps[0],inps[1],inps[2],inps[3]);
            stus.add(stu);
        }
        System.out.println(stus);

    }
}
