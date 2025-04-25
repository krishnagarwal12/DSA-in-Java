import java.util.*;

//check if a student will pass or fail using ternary operator
public class ternaryop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int marks = sc.nextInt();

        String type = (marks>=33)? "pass":"fail";
        System.out.println(type);
        
        

    }
    
}
