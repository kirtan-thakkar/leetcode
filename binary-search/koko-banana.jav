class Solution {
    boolean canEatInTime(int[] piles, int k, int h){
        // basicalyy aa speed calculate kare that it requires in terms of hours
        long hours = 0 ; // total hours required to eat all of the bananas
        for(int pile : piles){
            int div = pile/k;
            hours += div;

            if(pile % k !=0) {
                hours++; // if the remainder is not 0 then koko will requrire one more extra hour to eat the left banana
            }
        }
        return hours <= h;
    };
    public int minEatingSpeed(int[] piles, int h) {
        int low = 1;
        int high = 0;
        for (int pile : piles) { // high would be the max of the array 
            high = Math.max(high, pile);
        }
        int res =high;

        while(low <= high){
            int guess = (low + high)/2; //eating speed
            if(canEatInTime(piles, guess, h)){
                res = guess;
                high  = guess - 1;
            }else{
                low = guess + 1;
            }
        }
        return res;
    }
}