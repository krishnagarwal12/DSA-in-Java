public class palindrome_string {
    public static void palindrome(String str) { //1st process
        String newString = "";
        for(int i=str.length()-1; i>=0; i--) {
            newString = newString + str.charAt(i); 
        }
        System.out.println(newString);
        System.out.println(str);
        if(newString.equals(str)) {
            System.out.println("palindrome");
        }
        else{ 
            System.out.println("not palindrome");
        }
    }
    public static boolean palindrome1(String str) {  //2nd process
        for(int i=0; i<str.length()/2; i++) { //time complexity is O(n)
            //not palindrome
            if(str.charAt(i) != str.charAt(str.length()-1-i)) {
                return false;
            }
        }
        return true;

    }
    public static void main(String args[]) {
        String str = "racecar";
        palindrome(str);
        System.out.println(palindrome1(str));
    }
}
