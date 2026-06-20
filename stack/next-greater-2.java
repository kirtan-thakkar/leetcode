class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> s1 = new Stack<>();
        int[] res = new int[nums.length];
        int n = nums.length;
        for(int i = nums.length-2;i>=0;i--){ // stack nu preloading kari didhu since its circular array and the last element is connected to the first element.
            s1.push(nums[i]);
        }
        s1.push(nums[n-1]);

        for(int i=n-1;i>=0 ; i--){
            while(!s1.empty() && s1.peek() <= nums[i]){
                s1.pop();
            }
            if(s1.empty()){
                res[i]=-1;
            }else{
                res[i] = s1.peek();
            }
            s1.push(nums[i]);
        }
        return res;
    }
}