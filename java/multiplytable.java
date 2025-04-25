import java.util.*;

//enter a no. and print its multiplication table
public class multiplytable {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a no.");
        int n = sc.nextInt();

        for(int i=1;i<=10;i++) {
            int p = i*n;
            System.out.println(n+"*"+i+"="+p);
        }
    }
    
}
