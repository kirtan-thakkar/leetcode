class Solution {
    public int[] frequencySort(int[] nums) {
        HashMap<Integer,Integer> h1 = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int c = nums[i];
            h1.put(c , h1.getOrDefault(c,0)+1);
        } //calculated the frequecies
        
        Integer[] arr = new Integer[nums.length];

         for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i];
        }

        // Sort
        Arrays.sort(arr, (a, b) -> {

            // Increasing frequency
            if (!h1.get(a).equals(h1.get(b))) {
                return h1.get(a) - h1.get(b);
            }

            // Same frequency -> larger number first
            return b - a;
        });

        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr[i];
        }

        return nums;
        
    }
}