public class prefixarray {
    public static void subarray(int numbers[]) {
        int sum = 0;
        int max_sum = Integer.MIN_VALUE;

        //prefix array
        int prefix[] = new int[numbers.length];
        prefix[0] = numbers[0];

        for(int i=1;i<numbers.length;i++) {
            prefix[i] = prefix[i-1]+numbers[i];
        }
        for(int i=0;i<numbers.length;i++) { //start
            int start= i;
            for(int j=i;j<numbers.length;j++) { //end
                int end= j;

                sum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
                System.out.println("sum = "+sum);
                if(sum>max_sum) {
                    max_sum= sum;
                }

            }
        }
        System.out.println("max sum = "+max_sum);
    }

    public static void main(String args[]) {
        int numbers[] = {1,2,3,4};
        subarray(numbers);
    }
}
