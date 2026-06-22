class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> h1 = new HashMap<>();
        int res = -1;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            h1.put(c, h1.getOrDefault(c, 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(h1.get(c)==1){
                return res = i;
            }
        }
        return res;
    }
}