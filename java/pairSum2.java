import java.util.*;
public class pairSum2 {
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        //2 pointer approach with TC = O(n)
        int bp = -1; //bp = breaking point aur -1 liye hai because not a valid index
        for(int i=0; i<list.size(); i++) {
            if(list.get(i)>list.get(i+1)) {
                bp = i;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;
        while(lp!=rp) {
            int sum = list.get(lp) + list.get(rp);
            if(sum==target) {
                return true;
            }
            else if(sum>target) {
                rp = (list.size() + rp - 1)%list.size();
            }
            else{
                lp = (list.size() + 1)%list.size();
            }
        }

        return false;
        
    }
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(pairSum(list,30));

    }
    
}
