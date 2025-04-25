public class vowelsinstring {
    public static void vowels(String str) {
        int c=0;
        for(int i=0; i<str.length(); i++) {
            char ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
                c=c+1;
            }
        }
        System.out.println("the number of vowels are "+c);
    }
    public static void main(String args[]) {
        String str = "Jai Shree Shyam";
        vowels(str);
    }
}
