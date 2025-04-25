import java.util.*;

public class largestnoofarray {
    public static void largest(int numbers[]) {
        int largest = Integer.MIN_VALUE; //minus infinity 
        int smallest = Integer.MAX_VALUE; //plus infinity
        for(int i=0;i<numbers.length;i++) {
            if (numbers[i]>largest) {
                largest = numbers[i];
            }

        }
        System.out.println("The largest number in the array is "+largest);
    }

    public static void main(String args[]) {
        int numbers[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your nos.");
        for(int i=0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }

        largest(numbers);

    }
    
}
