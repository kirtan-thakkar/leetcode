class Solution {
    public boolean canAllocate(int nums[],int guess,int k){
        int pages=0,Sc=1;
        for(int i=0;i<nums.length;i++){
            if(pages+nums[i]<=guess){
                pages+=nums[i];
            }else{
                Sc++;
                pages=nums[i];
                
                if(Sc>k) return false;
            }
        }
        return true; 
    }
    public int splitArray(int[] nums, int k) {
        int n=nums.length;
        int high =0;
        int low =0;
       
       if(n<k) return -1;
       
       for(int num:nums){
           low=Math.max(low,num);
           high+=num;
       }
       
       while(low<=high){
           int guess=(low+high)/2;
           if(canAllocate(nums,guess,k)){
               high=guess-1;
           }else{
               low=+guess + 1;
           }
       }
       return low;
    }
}