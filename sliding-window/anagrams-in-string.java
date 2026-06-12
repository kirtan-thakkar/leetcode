class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int high=0;
        int low=0;
        List<Integer> res = new ArrayList<>();

        HashMap<Character,Integer> h1 = new HashMap<>();
        HashMap<Character,Integer> freqofp = new HashMap<>();
        int freqs =0;
        int freqp=0;
        for(int i=0;i<p.length();i++){
            char c = p.charAt(i);
            freqp++;
            freqofp.put(c,freqofp.getOrDefault(c,0)+1);
        }

        for(high=0;high<s.length();high++){
            char c = s.charAt(high);
            freqs++;
            h1.put(c,h1.getOrDefault(c,0)+1);

            if(freqs > freqp){
                char leftchr = s.charAt(low);
                freqs--;
                h1.put(leftchr,h1.get(leftchr)-1);
                if(h1.get(leftchr)==0){
                    h1.remove(leftchr);
                }
                low++;
            }
            if(freqofp.equals(h1)){
                res.add(low);
            }
        }
        return res;
    }
}