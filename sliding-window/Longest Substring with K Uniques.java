class Solution {
    public int longestKSubstr(String s, int k) {
        int low=0;
        int high=0;
        int res = -1;
        HashMap<Character, Integer> h1 = new HashMap<>();
        for( high=0;high<s.length();high++){
            //first step include high in your information
            char c = s.charAt(high);
            h1.put(c,h1.getOrDefault(c,0)+1); // frequency++ karto rehse when new elements are inserted
            // check information is right or wrong 
            //then wrong vada case ne resolve karo
            // right casse => h1.size==k
            //wrong case => h1.size>k or h1.size<k but less vado no koi sense nathi cause it is already less then kk toh low ne gatava thi koi bi faido che
            
            while(h1.size() > k){ // aa vada ma low ni gatavanu low++ kari ne so that the size of hasmap would decrease
                char leftChar = s.charAt(low);
                h1.put(leftChar, h1.get(leftChar)-1);
                if(h1.get(leftChar)==0){
                    h1.remove(leftChar);
                }
                low++;
            }
            //if exacty k unique then update the answer
            
            if(h1.size()==k){
                res = Math.max(res, high-low+1);
            }
            
            
        }
        return res;
    }
}