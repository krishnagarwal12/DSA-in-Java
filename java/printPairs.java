public class printPairs {
    public static void print_pairs(int numbers[]) {
        int total_pairs= 0; //or formula h. Total pairs = n(n-1)/2
        for(int i=0; i<numbers.length; i++) {
            for(int j = i+1; j<numbers.length; j++) {
                System.out.print("(" + numbers[i]+","+numbers[j]+") ");
                total_pairs++;
            }
            System.out.println();
            
        }
        System.out.println("Total pairs are "+ total_pairs);
    }

    public static void main(String args[]) {
        int numbers[] = {1,2,3,4};
        print_pairs(numbers);
        
    }
}
