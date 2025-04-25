import java.util.*;
public class two_d_array {
    public static void main(String args[]) {
        int matrix[][] = new int[3][3];
        int n = matrix.length; //rows
        int m = matrix[0].length; //column

        Scanner sc=new Scanner(System.in);
        //input
        for(int i=0;i<n;i++) { //rows
            for(int j =0;j<m;j++) { //columns
                matrix[i][j] = sc.nextInt();
            }
        }

        //output
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        //largest element
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                largest = Math.max(largest,matrix[i][j]);
            }
        }
        System.out.println("the largest no. of the array is " + largest);

        //smallest element
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                smallest = Math.min(smallest,matrix[i][j]);
            }

        }
        System.out.println("The smallest element is " + smallest);

    
    }
    
}
