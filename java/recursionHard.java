public class recursionHard {
    public static int tilingProblem(int n) {  //2*n(floor size)
        //base case
        if(n==0 || n==1) {
            return 1;
        }
        //kaam
        //verticle choice
        int fnm1 = tilingProblem(n-1);

        //horizontal problem
        int fnm2 = tilingProblem(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;

    } 

    public static void removeDuplicates(String str,int idx,StringBuilder newStr,boolean map[]) {
        //base case
        if(idx==str.length()) {
            System.out.println(newStr);
            return;
        }
        //kaam
        char currChar =str.charAt(idx);
        if(map[currChar-'a']==true) {
            //duplicate hai
            removeDuplicates(str,idx+1,newStr,map);
        }
        else {
            map[currChar-'a']=true;
            removeDuplicates(str,idx+1,newStr.append(currChar),map);
        }


    }

    public static int friendsPairing(int n) {  //n = no. of friends
        if(n==1 || n==2) {
            return n;
        }
        //single khada h agar koi
        int fnm1 = friendsPairing(n-1);

        //pair mai khada h agar koi
        int fnm2 = friendsPairing(n-2);
        int pairWays = (n-1)*fnm2;

        //totalWays
        int totWays = fnm1+pairWays;
        return totWays;

    }

    public static void printBinaryString(int n, int lastPlace, String str) {
        //base case
        if(n==0) {
            System.out.println(str); 
            return;
        }
        //kaam
        printBinaryString(n-1,0,str+"0");

        if(lastPlace == 0) {
            printBinaryString(n-1,1,str+"1");
        }

    }
    public static void main(String args[]) {
        //System.out.println(tilingProblem(4));
        //String str = "jaaaiimaaattaadiii";
        //removeDuplicates(str,0,new StringBuilder(""),new boolean[26]);
        //System.out.println(friendsPairing(4));
        printBinaryString(3,0,"");
    }
    
}
