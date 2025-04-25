public class subsetsOfString {
    public static void findSubsets(String str, int i, String ans) {
        //base case
        if(i==str.length()) {
            if(ans.length()==0) {
                System.out.println("null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //yes choice
        findSubsets(str, i+1, ans+str.charAt(i));
        //no choice
        findSubsets(str, i+1, ans);
    }
    public static void main(String args[]) {
        String str = "abc";
        String ans = "";
        findSubsets(str,0,ans);
    }
    
}
