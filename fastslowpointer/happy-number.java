class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast=n;

        while(fast!=1){
            slow = sumation(slow);
            fast = sumation(fast);
            fast = sumation(fast);

            while(slow == fast && slow!=1){
                return false;
            }
        }
        return true;

    }
    int sumation(int n){
            int sum=0;
            while(n>0){
                int digit = n%10;
                n=n/10;
                sum = sum+ digit*digit;
            }
            return sum;
        }
}