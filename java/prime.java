import java.util.*;

//check whether the number is prime
public class prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c=0;
        int i;

        for(i=1;i<=(n/2);i++) {
            if(n%i==0) {
                c=c+1;
            }
        }
        
        if(c==1){
            System.out.println(n+"is a prime no.");
        }
        else {
            System.out.println(n+"is not a prime no.");
        }
    }
    
}
