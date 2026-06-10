class Solution {
    public int lengthOfLongestSubstring(String s) {
        int low=0;
        int high=0;
        int res=0;
        HashMap<Character,Integer> h1 = new HashMap<>();
        for(high=0;high<s.length();high++){
            char c = s.charAt(high);
            h1.put(c,h1.getOrDefault(c,0)+1);

            int k = high-low+1; //important

            //h1.size()>k is never posible ever in this question;
            // hasmap ni size current window na length thi kevi ritna moti bani sake !

            //whenever low ko shrink thai tyare k gatse hamesha
            while(h1.size() < k){
                char leftChar = s.charAt(low);
                h1.put(leftChar,h1.get(leftChar)-1);
                if(h1.get(leftChar)==0){
                    h1.remove(leftChar);
                }
                low++; // low vadiyu ekle again k find karvu padse since  gate che
                k=high-low+1;
            }

            if(h1.size()==k){
                res = Math.max(res,k);
            }
        }
        return res;
    }
}