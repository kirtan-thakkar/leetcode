public class trapRainwater {
    public static int trappedWater(int height[]){
        // calculate the left max boundary
        int leftMax[] = new int[height.length];
        leftMax[0] = height[0];
        for(int i=1;i<height.length;i++){
            if(leftMax[i]<height[i]){
                leftMax[i] = height[i];
            }
            if(leftMax[i]<leftMax[i-1]){
                leftMax[i]=leftMax[i-1];
            }
        }
        // calculate the right max boundary
        int RightMax[] = new int[height.length];
        RightMax[height.length-1] = height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            if(RightMax[i]<height[i]){
                RightMax[i] = height[i];
            }
            if(RightMax[i]<RightMax[i+1]){
                RightMax[i] = RightMax[i+1];
            }
        }
        // for(int i=0;i<RightMax.length;i++){
        //     System.out.println(RightMax[i]);
        // }
        //loop
        int trappedWater = 0;
        for(int i=0;i<height.length;i++){
            int waterlevel = Math.min(leftMax[i],RightMax[i]);
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
        //waterlevel = min(leftmax . rightmax)
        //trapped water = (waterlevel-height)*width width=1

    }
    public static void main(String args[]){
        int height[] = {4,2,0,6,3,2,5};
        System.out.println(trappedWater(height));
    }
}
