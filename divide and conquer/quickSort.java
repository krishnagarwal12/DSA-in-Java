//ascending order
public class quickSort {
    public static void printArr(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public static void quickSorting(int arr[], int si, int ei) {
        //base case
        if(si>=ei) {
            return;
        }
        //kaam
        int pIdx = partition(arr, si, ei); //pivot index
        //pivot already apne sahi jagah pe hoga
        quickSorting(arr, si, pIdx-1); //left
        quickSorting(arr, pIdx+1, ei); //right
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1;

        for(int j=si;j<ei;j++) {
            if(arr[j]<=pivot) {
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //swap again to bring pivot element to the right position
        i++;
        //swap
        int temp = arr[ei];
        arr[ei] = arr[i];
        arr[i] = temp;

        return i;
    }

    public static void main(String[] args) {
        int arr[] = {6,3,9,8,2,5,-5};
        quickSorting(arr,0,arr.length-1);
        printArr(arr);
    }
}
