public class quickSort {
    public static void quickSort(int arr[], int si, int ei) {
        if(si>=ei) {
            return;
        }
        int pIdx=partition(arr,si,ei); //yeh hame pivot index return krega
        quickSort(arr,si,pIdx-1);//left part
        quickSort(arr,pIdx+1,ei);//right part
    }

    public static int partition(int arr[], int si, int ei) {
        int i=si-1;
        int pivot = arr[ei];
        for(int j=si;j<ei;j++) {
            //swap
            if(arr[j]<=pivot) { 
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i]=temp;
                
            }
        }
        //pivot element ko beech mai laane ke liye
        i++;
        int temp=arr[i];
        arr[i] = pivot;
        arr[ei] = temp;
        return i;
    }

    public static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String args[]) {
        int arr[] = {3,6,9,8,2,9};
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }

}
