public class subarrays {
    //print the max and min subarray sum aswell
    public static void subarray(int numbers[]) {
        int total_subarrays= 0;
        int largest_sum = Integer.MIN_VALUE;
        int smallest_sum = Integer.MAX_VALUE;
        int sum = 0;
        for(int i=0;i<numbers.length;i++) { //start
            for(int j=i; j<numbers.length; j++) { //end
                sum=0; 
                for(int k=i; k<=j;k++) { //print
                    System.out.print(numbers[k] + ",");
                    sum = sum+numbers[k];
                    
                }
                total_subarrays++;
                System.out.println();
                System.out.println("sum = "+sum);
                if(sum>=largest_sum) {
                    largest_sum = sum;
                }
                if(sum<smallest_sum) {
                    smallest_sum=sum;
                }
            }
            System.out.println();
        }
        System.out.println("the total subarrays are "+ total_subarrays);
        System.out.println("The largest sum = "+largest_sum);
        System.out.println("The smallest sum is = "+smallest_sum);

    }

    public static void main(String args[]) {
        int numbers[] = {1,2,3,4};
        subarray(numbers);
    }
}
