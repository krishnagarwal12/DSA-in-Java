public class pivotedarray {
    public static int binary(int numbers[],int target) {
        int start = 0;
        int end = numbers.length-1;
        

        while(start<=end) {
            int mid = (start+end)/2;
            if(numbers[mid]==target) {
                return mid;
            }
            else if(numbers[start]<=numbers[mid]) {
                //start to mid part is sorted humlog ko pata chal jaiga
                if(target>=numbers[start] && target<numbers[mid]) {
                    end = mid -1;
                }
                else{
                    start=mid+1;
                }

            }
            else if(numbers[mid]<=numbers[end]) {
                //mid to end part is sorted
                if(target>numbers[mid] && target<numbers[end]) {
                    start = mid +1;
                }
                else {
                    end = mid-1;
                }


            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {4,5,6,7,8,9,1,2};
        System.out.println(binary(numbers,1));
    }
}
