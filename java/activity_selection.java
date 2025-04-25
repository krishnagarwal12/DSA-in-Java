import java.util.*;
public class activity_selection {
    public static void main(String args[]) {
        int start[] = {1,3,0,5,8,5};
        int end[] = {2,4,6,7,9,9};

        //end time ke basis pe sorted hai
        int maxAct = 0; //counter
        ArrayList<Integer> ans = new ArrayList<>();

        //1st activity to hamesha hogi hi
        maxAct = 1;
        ans.add(0); //index add kr rhe h
        int lastEnd = end[0]; 
        
        for(int i=1;i<end.length;i++) {
            if(start[i]>=lastEnd) {
                //activity select
                maxAct++;
                ans.add(i);
                lastEnd = end[i];
            }
        }
        System.out.println("Max activities ="+maxAct);
        for(int i=0;i<ans.size();i++) {
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}
