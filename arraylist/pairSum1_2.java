//2 pointer approach - O(n)
import java.util.ArrayList;

public class pairSum1_2 {

    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int lp = 0, rp = list.size()-1;
        while(lp<rp) {
            if(list.get(lp)+list.get(rp)==target) {
                return true;
            }
            if(list.get(lp)+list.get(rp) > target) {
                rp--;
            }
            else {
                lp++;
            }
        }
        return false;
    }
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int target = 5;
        System.out.println(pairSum(list,target));
    }
}
