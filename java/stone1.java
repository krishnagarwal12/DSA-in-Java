import java.util.*;
public class stone1 {
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
        
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int max=0;
        int min=0;
        int stone=0;
        //System.out.println("Enter the number of stones on the ground");
        int n=sc.nextInt();
        //System.out.println("Enter the weights of the stone");
        int arr[]=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }
        sorting(arr);
        for(int i=0;i<=(n/2);i++) {
            max=arr[n-1-i];
            min=arr[i];
        }
            if(max==min) {
                stone=max;

            }
            
                

        
        
        System.out.println(stone);

    }
}
