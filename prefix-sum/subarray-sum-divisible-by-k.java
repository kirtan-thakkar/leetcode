class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        int sum=0;
        h1.put(0,1);
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum = sum+nums[i];
            int remainder = sum%k;
            if(remainder<0){
                remainder = remainder + k;
            }
            if(h1.containsKey(remainder)){
                count = count + h1.get(remainder);
            }
            h1.put(remainder,h1.getOrDefault(remainder,0)+1);
        }
        return count;
    }
}