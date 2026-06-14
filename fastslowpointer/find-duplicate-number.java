class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] visited =  new boolean[nums.length];
        for(int i=0;i<nums.length;i++){
            if(visited[nums[i]]==true){
                return nums[i];
            }
            visited[nums[i]]=true;
        }
        return 0;
    }
}