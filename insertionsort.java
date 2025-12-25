import java.util.*;
public class insertionsort {
    public static void main(String[] args){
        int[] arr={7,5,4,8,2};
        System.out.println("Unsorted array");
        for(int una:arr){
            System.out.print(una +" ");
        }System.out.println();
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j=j-1;
            }arr[j+1]=key;
        }
       System.out.println("Sorted array");
       for(int sa:arr){
            System.out.print(sa +" ");
        }
    }
}
