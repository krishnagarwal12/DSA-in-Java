public class invertedhalfpyramid1 {
    public static void inverted_rotated_half_pyramid(int n){
        int j = 0;
        int i = 0;

        for(i=1; i<=n; i++) {
            //spaces
            //n-i number of spaces hai jo print krna h
            for(j=1; j<= n-i; j++){
                System.out.print(" ");
            }
            //stars
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
             System.out.println();

        }
        
    }

    public static void main(String args[]) {
        inverted_rotated_half_pyramid(4);
    }
}
