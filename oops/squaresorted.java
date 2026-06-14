class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int pos = nums.length - 1;

        int[] result = new int[nums.length];

        while (start <= end) {
            if (Math.abs(nums[start]) >= Math.abs(nums[end])) {
                result[pos] = nums[start] * nums[start];
                start++;
            } else {
                result[pos] = nums[end] * nums[end];
                end--;
            }
            pos--;
        }

        return result;
    }
}