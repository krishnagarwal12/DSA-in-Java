import java.util.*;

//find the sum of first 'n' natural nos.
public class whilesum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 1;
        int sum = 0;
        
        while(counter<=n) {
            sum = sum+counter;
            counter++;
        }
        System.out.println("the sum of the first n natural nos. is"+sum);
    }
    
}
