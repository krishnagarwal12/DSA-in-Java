import java.util.*;
public class anagrams {
    public static void anagram(String str1, String str2) { // IMPORTANT IMPORTANT IMPORTANT IMPORTANT
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        //first check if lengths are same
        if(str1.length() == str2.length()) {
            //convert strings into char array so that we can use Arrays.sort() function to sort it
            char[] str1charArray = str1.toCharArray();
            char[] str2charArray = str2.toCharArray();

            //sorting the char Array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);

            //if the sorted arrays are equal then the given strings are anagrams
            boolean result = Arrays.equals(str1charArray, str2charArray);
            if(result) {
                System.out.println("anagrams");
            }
            else{
                System.out.println("not anagrams");
            }

        }
        else{ //when lengths are not equal
            System.out.println("Not anagrams");
        }
    }
    public static void main(String args[]) {
        String str1 = "race";
        String str2 = "care";
        anagram(str1,str2);
    }
}
