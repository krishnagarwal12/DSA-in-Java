public class divideAndConquerAssignment {
    public static void mergeSortString(String arr[], int si, int ei) {
        //base case
        if(si>=ei) {
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSortString(arr,si,mid);
        mergeSortString(arr,mid+1,ei);
        merge(arr,si,ei,mid);
    }

    public static void merge(String arr[],int si,int ei,int mid) {
        String temp[] = new String[ei-si+1];
        int i=si;
        int j=mid+1;
        int k=0;

        while(i<=mid && j<=ei) {
            if(arr[i].compareTo(arr[j])<0) {
                temp[k]=arr[i];
                i++;
            }
            else {
                temp[k]=arr[j];
                j++;
            }
            k++;
        }
        while(i<=mid) {
            temp[k]=arr[i];
            i++;
            k++;
        }
        while(j<=ei) {
            temp[k]=arr[j];
            j++;
            k++;
        }
        //copy temp array to original array
        for(k=0,i=si;k<temp.length;k++,i++) {
            arr[i]=temp[k];
        }
    }
    public static void printArray(String arr[]) {
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String args[]) {
        String arr[] = {"sun","earth","mars","mercury"};
        mergeSortString(arr,0,arr.length-1);
        printArray(arr);
    }
}
