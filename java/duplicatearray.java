public class duplicatearray {
    public static String duplicate(int numbers[]) {
        for(int i=0; i<numbers.length; i++) {
            for(int j =i+1; j<numbers.length; j++) {
                if (numbers[i]==numbers[j]) {
                    return "true";
                    
                }

            }
        }
        return "false";
    }

    public static void main(String args[]) {
        int numbers[] = {1,2,3,4};
        System.out.println(duplicate(numbers));
    }
}
