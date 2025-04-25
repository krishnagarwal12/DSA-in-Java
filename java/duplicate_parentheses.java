import java.util.Stack;

public class duplicate_parentheses {   //time complexity = O(n) i.e. linear time complexity

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();
        
        //phele closing bracket ke liye check kr lenge kyuki usko chode ke baaki (,a,b,+,-.....) sabkopush krna h toh else mai daal denge
        for(int i=0;i<str.length();i++) {
            char ch = str.charAt(i);

            //closing
            if(ch==')') {
                int count=0;
                while(s.peek()!='(') {
                    count++;
                    s.pop();
                }
                if(count<1) {
                    return true;
                }
                else {
                    s.pop(); //parentheses ko pop kr denge stack se kyuki woh pair duplicate nai h
                }
            }
            //opening, operators, operands
            else {
                s.push(ch);
            }
        }
        return false;
        
    }
    public static void main(String args[]) {
        String str = "((a+b))";
        String strr = "(a-b)";
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(strr));
    }
    
}
