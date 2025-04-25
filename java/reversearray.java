import java.util.*;

public class reversearray {
    public static void reverse(int numbers[]) {
        int start=0;
        int end=numbers.length -1;

        while(start<end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

    }
    public static void main(String args[]) {
        int numbers[] = new int[6];
        Scanner sc= new Scanner(System.in);
        System.out.println("enter your array");
        for(int i =0;i<6;i++) {
            numbers[i] = sc.nextInt();
            
        }

        reverse(numbers);
        System.out.println("Reversed array");

        for(int i=0;i<numbers.length;i++) {
            System.out.print(numbers[i] + " ");
            
        }
        
        
    }
}
