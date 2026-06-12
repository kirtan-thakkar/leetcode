import java.util.*;

class Solution {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        HashMap<Character, Integer> freqOft = new HashMap<>();
        HashMap<Character, Integer> h1 = new HashMap<>();

        for (int i=0;i<t.length();i++) {
            char c = t.charAt(i);
            freqOft.put(c, freqOft.getOrDefault(c, 0) + 1);
        }

        int required = freqOft.size();
        int formed = 0; //is the number of distinct characters from t whose required frequency has been satisfied in the current window.

        int low = 0;
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        int high=0;
        for ( high = 0; high < s.length(); high++) {
            char c = s.charAt(high);

            h1.put(c, h1.getOrDefault(c, 0) + 1);

            if (freqOft.containsKey(c) &&
                h1.get(c).intValue() == freqOft.get(c).intValue()) {
                formed++;
            }

            while (formed == required) {

                if (high - low + 1 < minLen) {
                    minLen = high - low + 1;
                    start = low;
                }

                char leftChar = s.charAt(low);

                h1.put(leftChar, h1.get(leftChar) - 1);

                if (freqOft.containsKey(leftChar) &&
                    h1.get(leftChar) < freqOft.get(leftChar)) {
                    formed--;
                }

                if (h1.get(leftChar) == 0) {
                    h1.remove(leftChar);
                }

                low++;
            }
        }

        return minLen == Integer.MAX_VALUE
                ? ""
                : s.substring(start, start + minLen);
    }
}