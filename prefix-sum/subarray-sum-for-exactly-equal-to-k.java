class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        int sum =0;

        h1.put(0,1);
        int count=0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            int quest = sum-k;

            if(h1.containsKey(quest)){
                count = count + h1.get(quest);
            }

            h1.put(sum,h1.getOrDefault(sum,0)+1);
        }
        return count;
    }
}