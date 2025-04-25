public class selectionsort {
    public static void sorting(int arr[]) { //iska aur ek method hai jo dusra function banake likhi hu neeche
        int min= Integer.MAX_VALUE;
        int position = 0;
        for(int turn=0;turn<=arr.length-2;turn++) {
            min = Integer.MAX_VALUE;
            for(int i=turn;i<arr.length;i++) {
                if(arr[i] <min){
                    min=arr[i];
                    position =i;
                }
            }
            //swap
            int temp = arr[turn];
            arr[turn] = arr[position];
            arr[position] = temp;
        }

        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortings(int arr[]) { //jo method ma'am batai hai
        for(int i=0; i<=arr.length-2; i++) {
            int min_position = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j]<arr[min_position]) {
                    min_position = j;
                }

            }
            //swap
            int temp = arr[i];
            arr[i] = arr[min_position];
            arr[min_position] = temp;

        }
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String args[]) {
        int arr[] = {5,3,1,2,4};
        sortings(arr);
    }
}
