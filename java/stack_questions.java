import java.util.*;
public class stack_questions {
 
    //push element at bottom of stack
    public static void pushatbottom(Stack<Integer> s, int data) {
        //base case
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushatbottom(s,data);
        s.push(top);
    }

    //reverse a string
    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        int idx=0;
        while(idx<str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()) {
            result.append(s.pop());
        }
        return result.toString();
    }

    //reverse stack
    public static void reverseStack(Stack<Integer> s) {
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushatbottom(s, top);

    }

    public static void printStack(Stack<Integer> s) {
        while(!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
    public static void main(String args[]) {

        //---------------for pushatbottom----------------
        // Stack<Integer> s = new Stack<>();
        // s.push(1);
        // s.push(2);
        // s.push(3);

        // pushatbottom(s,4);
        // while(!s.isEmpty()) {
        //     System.out.println(s.pop());
        // }

        //---------------for reverse string------------------
        // String str = "jmd";
        // String result = reverse(str);
        // System.out.println(result);

        //----------------reverse stack--------------------
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        
        reverseStack(s);
        printStack(s);
    }
    
}
