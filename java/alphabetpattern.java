public class alphabetpattern {
    public static void main(String args[]) {
        int i;
        int j;
        char ch='A';

        for(i=1;i<=4;i++) {
            for(j=1;j<=i;j++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
