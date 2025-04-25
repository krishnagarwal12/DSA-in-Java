import java.util.*;

//IMPORTANT IMPORTANT

//Write a program that reads a set of integers, and then prints the sum of the even and odd integers.
public class sumofevenandodd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int choice;
        
        do{
            System.out.println("enter a no.");
            int n = sc.nextInt();
            if(n%2==0) {
                evenSum= evenSum+n;
            }
            else {
                oddSum = oddSum+n;
            }
            System.out.println("enter 1 to continue or 0 to end");
            choice = sc.nextInt();
        }while(choice==1);

        System.out.println("even sum= "+evenSum);
        System.out.println("odd sum "+oddSum);
    }
    
    
}
