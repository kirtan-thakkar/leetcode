class Solution {
    public int findMaxLength(int[] nums) {
        int zeros=0;
        int one =0;
        int maxLen=0;

        HashMap<Integer,Integer> h1 = new HashMap<>();
        h1.put(0,-1);

        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeros++;
            }else{
                one++;
            }
            int diff = zeros - one;

            if(h1.containsKey(diff)){
                maxLen = Math.max(maxLen,i-h1.get(diff));
            }else{
                h1.put(diff,i);
            }
        }
        return maxLen;
    }
}