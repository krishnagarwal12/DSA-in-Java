public class stringcompression {
    public static void compression(String str) { //time complexity = O(n)
        StringBuilder sb = new StringBuilder("");
        Integer c = 1;

        for(int i=0; i<str.length(); i++) {
            c=1;
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)) {
                c++;
                i++;
            }
            sb.append(str.charAt(i));
            if(c>1){
                sb.append(c.toString());
            }
        }

            
        
        System.out.println(sb.toString());
    }
    public static void main(String args[]) {
        String str = "aaabbcccdd";
        compression(str);
    }
}
