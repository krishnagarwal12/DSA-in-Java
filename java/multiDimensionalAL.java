import java.util.*;
public class multiDimensionalAL {
    public static void main(String args[]) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);list1.add(2);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);list2.add(4);
        mainList.add(list1);
        mainList.add(list2);

        System.out.println(mainList);

        //agar dono list alag alag print krwana hai
        for(int i=0;i<mainList.size();i++) { //isme i=0 list1 ka index hai aur i=1 list2 ka index h
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0;j<currList.size();j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();

        }

    }
    
}
