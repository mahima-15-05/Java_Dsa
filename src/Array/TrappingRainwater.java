package Array;
/*
 Given non-negative integers representing an elevation map where the width of each bar is 1,
 compute how much water it can trap after raining

 area of water trapped = (water level - bar level) * width;
*/


public class TrappingRainwater {

    public static int trappedWater(int height[]){
        int n=height.length;
        // 1. calculate left max boundary -array
        int leftMax[] = new int[height.length];
        leftMax[0]=height[0];
        for(int i=1; i<height.length; i++){
            leftMax[i]= Math.max(height[i], leftMax[i-1]);
        }

        // 2. calculate right max boundary -array
        int rightMax[] = new int[height.length];
        rightMax[height.length-1]= height[height.length-1];
        for(int i=n-2;i>=0; i--){
            rightMax[i]= Math.max(height[i], rightMax[i+1]);
        }

        int trappedWater= 0;
        int waterLevel=0;
        //loop
        for(int i=0; i<n;i++){
            // 3. waterLevel = min(leftMaxBoundary, rightMaxBoundary)
            waterLevel = Math.min(leftMax[i],rightMax[i]);

            // 4. trappedWater = waterLevel - height
            trappedWater+=waterLevel-height[i];
        }


        return trappedWater;

    }
    public static void main(String[] args) {
        int height[] = {10,2,9,4,5,6,7,8}; // this is an array // initial value stored to 0
        int result = trappedWater(height);
        System.out.println("Trapped water is "+result);
    }
}
