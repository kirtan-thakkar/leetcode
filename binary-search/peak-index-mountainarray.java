class Solution {

    public int peakIndexInMountainArray(int[] arr) {

        if(arr.length==0){

            return 0;

        }

        int low =1; 

        int high = arr.length -2 ;

        int res = -1;



        while(low <= high){

            int guess = (low +high)/2;

            int prevint = arr[guess-1];

            int nextint = arr[guess+1];

            if(arr[guess] > prevint && arr[guess] > nextint){

                return guess;

            }else if(arr[guess] < nextint ){
                low = guess + 1;
            }else{
                high = guess -1;
            }

        }

        return res;

    }
    // revise this cause this
    //has an important concept 
}