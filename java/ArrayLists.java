import java.util.ArrayList;
public class ArrayLists {
    public static void main(String args[]) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(28);
        list.add(4);
        list.add(5);

        //print reverse of an ArrayList --> TC = O(n)
        for(int i=list.size()-1; i>=0; i--) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        //find maximum in an array list --> TC = O(n)
        int max=list.get(0);   //ya phir we could write max = Integer.MIN_VALUE;
        for(int i=1;i<list.size();i++) {
            if(list.get(i)>max) {
                max = list.get(i);
            }
            //or we could write , max = Math.max(max,list.get(i));

        }
        System.out.println("The maximum element in the list = "+max);
        swap(list,1,4);
        System.out.println(list);
        
    }
    //swap 2 numbers in a arraylist
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);

    }
}
