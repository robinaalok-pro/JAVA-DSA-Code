package dsa_sheet;
import java.util.*;

public class maxminarray {
    public static void minmax(int[] array){
        Arrays.sort(array);
    }
    public static void main(String[] args) {
//        Input: arr[] = {3, 5, 4, 1, 9}
//        Output: Minimum element is: 1
//        Maximum element is: 9
        System.out.println("enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] array = new int[size];
        System.out.println("enter the elements of array");
        for (int i=0; i<size; i++){
            array[i] = sc.nextInt();
        }
        minmax(array);
        System.out.println("the minimum " + array[0]);
        System.out.println("the maximum  " + array[size-1]);


    }
}
