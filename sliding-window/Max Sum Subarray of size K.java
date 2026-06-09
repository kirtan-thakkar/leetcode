class Solution {
	public int maxSubarraySum(int[] arr, int k) {
		int low = 0;
		int high = k - 1;
		int sum = 0;
		for (int i = low; i <= high; i++) {
			sum = sum + arr[i];
		}
		int result = sum;
		while (high < arr.length - 1) {
			low++;
			high++;
			sum = sum - arr[low - 1] + arr[high];
			result = Math.max(result, sum);
			
		}
		return result;
		
	}
}
