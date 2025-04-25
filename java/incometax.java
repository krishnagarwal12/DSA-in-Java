import java.util.*;

//to calculate the income tax
public class incometax {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double income = sc.nextDouble();
        double tax;
        
        if (income<5) {
            tax = income*0;
        }
        else if (income>5 && income<10) {
            tax = income * 0.20;
        }
        else {
            tax = income * 0.30;
        }
        System.out.println("tax= "+tax);

    }
    
}

