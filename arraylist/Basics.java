import java.util.ArrayList;
public class Basics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        //add element - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(1,9); //O(n)
        System.out.println(list);

        //get element - O(1)
        int element = list.get(2); 
        System.out.println(element);

        //remove element - O(n)
        list.remove(2);
        System.out.println(list);

        //set element at index - O(n)
        list.set(2,10);
        System.out.println(list);

        //contains element - O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(3));

        //size of an arraylist
        System.out.println(list.size());
        //to iterate on arraylist
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }
}
