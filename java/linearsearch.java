import java.util.*;

public class linearsearch {
    public static int linear_search(int numbers[], int key) {
        for(int i=0;i<numbers.length; i++) {
            if(numbers[i]==key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        int numbers[] = {1,2,3,4,5,6};
        int key = 7;
        int linear = linear_search(numbers,key);

        if(linear==-1){
            System.out.println(" number not found");
        }
        else{
            System.out.println("the index of the key(no.) is "+linear);
        }

    }
    
}
