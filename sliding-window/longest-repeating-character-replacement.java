class Solution {
    public int characterReplacement(String s, int k) {
        int[] freq = new int[26]; 
        int low = 0;
        int maxCount = 0;
        int res = 0;

        for (int high = 0; high < s.length(); high++) {
            char c = s.charAt(high);
            freq[c - 'A']++;
            
            // Track the highest frequency of any single character in the current window
            maxCount = Math.max(maxCount, freq[c - 'A']);
            
            // Calculate remaining characters to replace; if it exceeds k, shrink the window
            int charactersToReplace = (high - low + 1) - maxCount; //diff
            while (charactersToReplace > k) {
                char leftChar = s.charAt(low);
                freq[leftChar - 'A']--;
                low++;
                charactersToReplace = (high - low + 1) - maxCount;
            }
            
            res = Math.max(res, high - low + 1);
        }
        
        return res;
    }
}
