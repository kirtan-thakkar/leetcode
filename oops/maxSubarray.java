import java.util.*;
import java.util.Arrays;

public class maxSubarray{
    public static void subArray(int[] number){
        int maxSum = Integer.MIN_VALUE; 
        for(int i=0;i<number.length;i++){
            int start = i;
            for(int j=i; j<number.length;j++){ 
                int end = j;
                int currSum=0; 
                for(int k=start;k<=end;k++){ // Include end element
                    currSum += number[k];
                }
                if(currSum>maxSum){
                    maxSum = currSum;
                }
                System.out.println("Subarray from " + start + " to " + end + " = " + currSum); 
            }
        }
        System.out.println("The max sum is going to be :" + maxSum);
    }
    public static int maxArray(int number[]){
        int prefix[] = new int[number.length];
        //prefix array calculate
        prefix[0]=number[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]= prefix[i-1] + number[i];
        }

        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
            int currSum = 0;
            for(int j=0;j<number.length;j++){
                currSum = i==0 ? prefix[j]: prefix[j] - prefix[i-1];
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }
            
        }
        System.out.println("The max sum of sub array using prefix array method is :" + maxSum);
        return 0;
    }
    public static void kadens(int number[]){
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
        for(int i=0;i<number.length;i++){
            currSum = currSum + number[i];
            if(currSum<0){
                System.out.println("Oh no the sum comes out to be negative that is :" + currSum);
                currSum=0;
            }
            if(currSum>maxSum){
                maxSum = currSum;
            }
        }
        System.out.println("The max sum of sub array using kadeans comes out to be :" + maxSum);
    }
    public static void main(String[] args){
        int arr[] = {3,20,5,6};
        int arr1[] = {-2,-3,4,-1,-2,1,5,-3};
        subArray(arr);
        maxArray(arr);
        kadens(arr1);
    }

}