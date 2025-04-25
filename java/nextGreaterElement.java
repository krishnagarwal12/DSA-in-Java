import java.util.Stack;

public class nextGreaterElement {
    public static void main(String args[]) {
        int arr[] = {6,8,0,1,3};
        Stack<Integer> s = new Stack<>();
        int nextGreater[] = new int[arr.length];

        for(int i=arr.length-1;i>=0;i--) {
            //step1: while loop
            while(!s.isEmpty() && arr[s.peek()]<=arr[i]) {
                s.pop();
            }

            //step2: if-else
            if(s.isEmpty()) {
                nextGreater[i] = -1;
            }
            else {
                nextGreater[i] = arr[s.peek()]; //arr[s.peek()] isiliye kr rhe h kyuki stack mai humne index store kiya hai, element nai.            
            }

            //step3: push krdo element ka index ko
            s.push(i);
        }

        for(int i=0;i<nextGreater.length;i++) {
            System.out.print(nextGreater[i]+" ");
        }
        System.out.println();
    }
    
}
