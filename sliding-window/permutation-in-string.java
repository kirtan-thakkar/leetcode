class Solution {
    public boolean checkInclusion(String s1, String s2) {

        boolean isPermutation = false;
        int k = s1.length();
        int high = 0;
        int low = 0;
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> freqOfs1 = new HashMap<>();
        int freqs1 = 0;
        int freqs2 = 0;
        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            freqs1++;
            freqOfs1.put(c, freqOfs1.getOrDefault(c, 0) + 1);
        }

        for (high = 0; high < s2.length(); high++) {
            char c = s2.charAt(high);
            freqs2++;
            h1.put(c, h1.getOrDefault(c, 0) + 1);

            if (freqs1 < freqs2) {
                char leftchr = s2.charAt(low);
                h1.put(leftchr, h1.get(leftchr) - 1);

                if (h1.get(leftchr) == 0) {
                    h1.remove(leftchr);
                }
                freqs2--;
                low++;
            }

            if (freqOfs1.equals(h1)) { //You must compare the entire frequency maps:
                return true;
            }

        }
        return isPermutation;

    }
}