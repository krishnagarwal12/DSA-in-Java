public class binaryStrings {

    public static void printBinaryStrings(int n, int lastPlace, String str) {
        //base case
        if(n == 0) {
            System.out.println(str);
            return;
        }
        //kaam
        printBinaryStrings(n-1, 0, str+"0"); //chahe lastPlace "0" ho ya "1" ho, humlog usme "0" append kr skte hai isiliye alag se dono 1 & 0 ke liye if else nai likhe
        if(lastPlace == 0) {
            printBinaryStrings(n-1, 0, str+"1");
        }
    }
    public static void main(String[] args) {
        printBinaryStrings(3,0,"");
    }
}
