class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> h1 = new HashMap<>();
        HashMap<Character, Integer> h2 = new HashMap<>();
        int counth1 = 0;
        int counth2 = 0;

        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            h1.put(c, h1.getOrDefault(c, 0) + 1);
            counth1++;
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);

            h2.put(c, h2.getOrDefault(c, 0) + 1);

        }
        for (char c : h2.keySet()) {
            // requires freq > available frequency
            if (h2.get(c) > h1.getOrDefault(c, 0)) {
                return false;
            }
        }

        return true;
    }
}