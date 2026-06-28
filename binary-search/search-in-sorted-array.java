class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int guess = (low + high) / 2;

            if (nums[guess] == target) {
                return guess;
            }

            // Condition 1:
            if (nums[guess] > nums[nums.length - 1]) { 
                if (nums[guess] < target) {
                    low = guess + 1; // right javanu
                } else {
                    if (nums[0] > target) {
                        low = guess + 1; // right javanu
                    } else {
                        high = guess - 1; // left javanu
                    }
                }
            } 
            else { 
                if (nums[guess] > target) {
                    high = guess - 1; // left javanu
                } else {
                    if (nums[nums.length - 1] < target) {
                        high = guess - 1; // left javanu
                    } else {
                        low = guess + 1; // right javanu
                    }
                }
            }
        } 

        return -1;
    }
}
// best solution that gives answer in 1pass