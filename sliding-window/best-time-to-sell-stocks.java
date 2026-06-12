class Solution {
    public int solution( int[] prices) {
        int cp=Integer.MAX_VALUE;
        int sp=0;
        for(int i=0;i<prices.length;i++){
            cp = Math.min(cp,prices[i]);
            sp= Math.max(sp,prices[i]-cp);
        }
        return sp;
    }
}