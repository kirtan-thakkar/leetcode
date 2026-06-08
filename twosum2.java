class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int numArr[] = new int[2];
        int start = 0;
        int end = numbers.length - 1;
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[start] + numbers[end] == target & start!=end) {
                numArr[0] = start+ 1;
                numArr[1] = end + 1;

            }
            if (numbers[start] + numbers[end] > target) {
                end--;
            }else{
                start++;
            }
        }
        return numArr;
    }
}