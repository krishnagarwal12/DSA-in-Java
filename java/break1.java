import java.util.*;

//keep entering and printing nos. until you get a multiple of 10
public class break1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        do{
            System.out.print2("Enter your no.");
            int n = sc.nextInt();
             
            if(n%10==0) {
                break;
            }
            System.out.println(n);
        }while(true);

    }
    
}
