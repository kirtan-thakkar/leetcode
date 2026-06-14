import java.util.Arrays;

public class reverse_array {
    public static void reverse(int arr[]) {
        int start=0,end=arr.length-1, temp=0;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        reverse(arr);
        
    }

    // Reverses the array in-place
    
}