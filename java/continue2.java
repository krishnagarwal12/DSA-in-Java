import java.util.*;

//print all the nos. entered by the user except multiple of 10
public class continue2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("enter a no.");
            int n = sc.nextInt();
            if(n%10==0) {
                continue;
            }
            System.out.println(n);
        }while(true);
    }
    
}
