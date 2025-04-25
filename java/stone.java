import java.util.*;
public class stone {
    
        //sorting
        public static void sorting(int arr[]) {
            for(int turn=0; turn<= arr.length-2; turn++) {
                for(int j=0;j<=arr.length-2-turn;j++) {
                    //swap
                    if(arr[j] > arr[j+1]) {
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
                
            }
            for(int i=0;i<arr.length;i++) {
                System.out.print(arr[i] + " ");
            }
        }
        public static void main(String args[]) {
            System.out.println("Enter the number of stones on the ground");
            int n=sc.nextInt();
            System.out.println("Enter the weights of the stone");
            int arr[]=new int[n];
            for(int i=1;i<=n;i++) {
                arr[i]=sc.nextInt();
            }
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
            else if(arr[i]<min) {
                min=arr[i];     
            }
                
        }
    
}
