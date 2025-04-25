import java.util.*;
public class pairSum1 {
    //2 pointer approach with TC = O(n)
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int lp=0;
        int rp=list.size()-1;

        while(lp<rp) {
            int sum = list.get(lp) + list.get(rp);
            if(sum==target) {
                return true;
            }
            else if(sum>target) {
                rp--;
            }
            else{
                lp++;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(pairSum(list,10));

    }
    
}
