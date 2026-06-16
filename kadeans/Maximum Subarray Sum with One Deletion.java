class Solution {
    public int maximumSum(int[] arr) {
        //intu
        int ans  = arr[0];
        int nodelete = arr[0];
        int onedelete = 0;

        for(int i=1;i<arr.length;i++){
            onedelete  = Math.max(onedelete + arr[i],nodelete); // previous koi element delete thai gayu che and then ema arr[i] jodiyu either current arr[i] ne delete karvu che toh apde nodelete(previous vadu) lai lia lidhu that is current vada arr[i] ne skip kari didhu
            nodelete = Math.max(nodelete+arr[i],arr[i]);

            ans = Math.max(ans, Math.max(onedelete,nodelete));
        }
        return ans;
    }
}