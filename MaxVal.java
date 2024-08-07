import java.util.Scanner;

public class MaxVal {
    public static void main(String[] args) {
        int arr[] = {6,7,12,1,3};
        System.out.println(max(arr,1,3));

    }
    static  int max(int[] arr , int start, int end){
        int maxval= arr[start];
        for (int i=0; i<=end; i++) {
            if (arr[i] > maxval) {
                maxval = arr[i];

            }
        }
        return maxval;
    }
}


