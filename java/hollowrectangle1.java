public class hollowrectangle1 {
    public static void hollow_rectangle(int totRows, int totCols) {
        int i = 0;
        int j = 0;

        for(i=1; i<=totRows; i++) {
            for(j=1; j<=totCols; j++) {
                if(i==1 || i==totRows || j==1 || j==totCols) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        hollow_rectangle(4,5);
    }
}
