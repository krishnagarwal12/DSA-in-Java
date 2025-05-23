import java.util.Stack;

public class valid_parenthesis {

    public static boolean validParentheses(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);

            //opening bracket
            if(ch=='(' || ch=='{' || ch=='[' ) {
                s.push(ch);
            }
            //closing
            else {
                if(s.isEmpty()) {
                    //agar str = ))))) hua sirf ya {})
                    return false;
                }
                if( (s.peek()=='(' && ch==')') 
                    || (s.peek()=='{' && ch=='}')
                    || (s.peek()=='[' && ch==']') ) {
                        s.pop();
                }
                else {
                    return false;
                }
            }
        }

        if(s.isEmpty()) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String args[]) {
        String str = "({})[])";
        System.out.println(validParentheses(str));
    }
    
}
