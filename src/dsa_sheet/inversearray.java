package dsa_sheet;
import java.util.*;
public class inversearray {
    public static void invarray(int[] arr, int start, int end){
        int temp;
        while(start < end) {
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
}
    public static void main(String[] args){
//        Input  : arr[] = {1, 2, 3}
//        Output : arr[] = {3, 2, 1}

        int[] array = {1, 2, 3};
        System.out.println("heelo world");
        invarray(array, 0 , 2);
        for(int i=0; i< array.length; i++){
            System.out.println(array[i] + ",");
        }

    }

}
