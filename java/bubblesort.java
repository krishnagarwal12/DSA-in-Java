public class bubblesort {
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

    public static void printarray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }

    public static void main(String args[]) {
        int arr[] = {5,3,2,1,4};
        sorting(arr);
        //printarray(arr);
    }
}
