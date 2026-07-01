class Solution {
    public boolean canAllocate(int arr[],int guess,int k){
        int pages=0,Sc=1;
        for(int i=0;i<arr.length;i++){
            if(pages+arr[i]<=guess){
                pages+=arr[i];
            }else{
                Sc++;
                pages=arr[i];
                
                if(Sc>k) return false;
            }
        }
        return true; 
    }
    public int findPages(int[] arr, int k) {
        int n=arr.length;
        int high =0;
        int low =0;
       
       if(n<k) return -1;
       
       for(int num:arr){
           low=Math.max(low,num);
           high+=num;
       }
       
       while(low<=high){
           int guess=(low+high)/2;
           if(canAllocate(arr,guess,k)){
               high=guess-1;
           }else{
               low=+guess + 1;
           }
       }
       return low;
    }
}