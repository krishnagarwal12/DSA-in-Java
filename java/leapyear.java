import java.util.*;

//IMPORTANT IMPORTANT IMPORTANT IMPORTANT
//check whether a year is a leap year or not
public class leapyear {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int year = sc.nextInt();
        boolean x = year%4 ==0;
        boolean y = year%100 !=0;
        boolean z = (year%100==0) && (year%400==0);
        
        if (x && (y||z))
        System.out.println("Leap year");
        else
        System.out.println("Not a leap year");
    }
    
}
