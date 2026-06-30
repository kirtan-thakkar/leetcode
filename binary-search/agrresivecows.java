import java.util.Arrays;

class Solution { 
    boolean canPlaceCows(int[] stalls, int k, int guess) {
        int cowCount = 1; 
        int lastPos = stalls[0]; 
        
        for (int i = 1; i < stalls.length; i++) { 
            if (stalls[i] - lastPos >= guess) { 
                cowCount++; 
                lastPos = stalls[i]; 
            } 
            if (cowCount >= k) {
                return true; 
            }
        } 
        return false; 
    }
    
    public int aggressiveCows(int[] stalls, int k) { 
        // 1. Always sort the stalls first
        Arrays.sort(stalls); 
        
        int n = stalls.length;
        int low = 1; 
        int high = stalls[n - 1] - stalls[0]; 
        int ans = 0;
        
        // 2. Binary search to find the largest minimum distance
        while (low <= high) {
            int guess = (low + high) / 2;
            
            if (canPlaceCows(stalls, k, guess)) {
                ans = guess;     // guess is possible, try to find a larger distance
                low = guess + 1;
            } else {
                high = guess - 1; // mid is too large, look for a smaller distance
            }
        }
        return ans;
    } 
    // rememeber in such question all you need to know is how and what will be the helper 
}
