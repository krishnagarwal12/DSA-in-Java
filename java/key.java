import java.util.*;
public class key {
    public static void main(String args[]) {
        
        Scanner sc=new Scanner(System.in);
        String s;
        int c=0;
        int ch;
        int ch3;
        //System.out.println("enter the number of rooms in the college");
        int n=sc.nextInt();
        //System.out.println("Enter your string");
        s=sc.next();
        for(int i=0;i<s.length();i=i+2) {
            char ch1=s.charAt(i);
            char ch2=s.charAt(i+1);
            ch=ch2;
            ch3=ch1-32;
            if(ch3!=ch) {
                c++;
            }
            ch=0;
            ch3=0;
        }
        System.out.println(c);
        
    }
}
