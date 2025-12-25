public class selectionsort {
    public static void selection(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    public static void main(String[] args){
        int arr[]={6,3,7,2,9,5};
        System.out.println("Unsorted Array");
        for(int una:arr){
            System.out.print(una +" ");
        }System.out.println();
        selection(arr);
        System.out.println("Sorted Array");
        for(int sa:arr){
            System.out.print(sa +" ");
        }
    }
}
