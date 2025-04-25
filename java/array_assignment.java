public class array_assignment {
    public static void number_of_sevens(int matrix[][]) {
        int c=0;
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length; j++) {
                if(matrix[i][j]==7) {
                    c=c+1;
                }
            }
        }
        System.out.println("The number of seven are "+c);
    }

    public static void sum(int matrix[][]) {
        int sum=0;
        for(int j=0;j<matrix[0].length;j++) {
            sum = sum+matrix[1][j];
        }
        System.out.println("the sum of the elements of the second row is "+sum);
    }

    public static void transpose(int matrix[][]) {

        //printing the original matrix
        System.out.println("original matrix");
        for(int i=0;i<matrix.length;i++) {
            for(int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] +" ");
            }
            System.out.println();
        }
        //transpose matrix    
        int transpose[][] = new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++) {
            for(int j=0;j<matrix[0].length;j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        //printing the transpose matrix
        for(int i=0;i<transpose.length;i++) {
            for(int j=0; j<transpose[0].length; j++) {
                System.out.print(transpose[i][j] +" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        int matrix[][] = {{4,7,8}, {8,8,7}};
        number_of_sevens(matrix);
        sum(matrix);
        transpose(matrix);
    }
}
