import java.util.*;

public class p8 {
    public static void main(String args[]) {
        //to calculate the total bill( add on with 18% gst)
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float c = sc.nextFloat();
        
        float total = a+b+c;
        System.out.println("Total bill= "+total);

        //add on- 18% gst
        float newtotal = total + (0.18f * total);
        System.out.println("New total bill= "+ newtotal);
        
    }
    
}
