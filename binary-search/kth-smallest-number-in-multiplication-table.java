class Solution {
    boolean check(long element,long m, long n,long k){
        long count = 0;
        long i=1,j=n;
        while(i<=m && j>=1){
            long target = i*j;
            if(target <= element){
                count+=j;
                i++;
            }else{
                j--;
            }
        }
        return count>=k;
    }
    public int findKthNumber(int m, int n, int k) {
        long l = 1,h = m * n,ans = 1;
        while(l <= h){
            long guess = (h + l) / 2;
            if(check(guess,m,n,k)){
                ans = guess;
                h = guess - 1;
            }
            else{
                l = guess + 1;
            }
        }
        return (int)ans;
    }
}