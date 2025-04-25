import java.util.*;
public class p5 {
    public static void main(String args[]) {
        //calculate the area of circle
        Scanner sc = new Scanner(System.in);
        double r= sc.nextDouble();
        double area = 3.14*r*r;
        System.out.println("The area of the circle is "+area);


        /*if we use float data type then write 3.14f beacuse java considers any decimal value as double
             float r = sc.nextFloat();
             float area = 3.14f*r*r;
        */

    }
    
}
