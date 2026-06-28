class Solution {
    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int res = 0;
        while(low <= high){
            int guess = (low+high)/2;

            if(nums[guess] > nums[nums.length-1]){  // if nums[guess] > nums[n-1]{ part2 } else { part1 }
                low = guess + 1;

            }else{
                res = nums[guess] ;
                high = guess - 1;
            }
        }
        return res;
    }
}

// little bit tough, the main thing to find was the monotonicity as we learned in the linkedlist reversal where the k was given and last k elements were taken out and pasted in front

// the main condition was nums[guess] > nums[nums.length -1] means last element karta agar guess wala element is greater toh aa part2 else part1 and apdo answer is in the part1