class Solution {
    static int smallestSumSubarray(int a[], int size) {
        // your code here
        int ans = a[0];
        int sum= a[0];
        for(int i=1;i<a.length;i++){
            sum = Math.min(a[i],sum + a[i]);
            ans = Math.min(ans,sum);
        }
        return ans;
    }
}