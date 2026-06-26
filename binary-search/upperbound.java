class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int res = -1;
        int low =0;
        int high=arr.length-1;
        while(low <= high){
            int mid = (high + low)/2;
            if(arr[mid] >= x){
                res = mid;
                high = mid -1;
            }else{
                
                low = mid + 1;
            }
        }
        return res;
    }
}
