class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> h1 =  new HashMap<>();
        int res =0;

        for(int i=0;i<text.length();i++){
            char c = text.charAt(i);
            h1.put(c,h1.getOrDefault(c,0)+1);
        }
        int b = h1.getOrDefault('b', 0);
        int a = h1.getOrDefault('a', 0);
        int l = h1.getOrDefault('l', 0) / 2; // Requires 2 'l's per balloon
        int o = h1.getOrDefault('o', 0) / 2; // Requires 2 'o's per balloon
        int n = h1.getOrDefault('n', 0);
        
        // The bottleneck character determines the maximum number of words
        return Math.min(b, Math.min(a, Math.min(l, Math.min(o, n))));
        
    }
}