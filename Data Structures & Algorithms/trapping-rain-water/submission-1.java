class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int vol = 0;
        int leftMax = 0;
        int rightMax = 0;
        int[] maxArrLeft = new int[n];
        int[] maxArrRight = new int[n];
        for(int i = 0 ; i < n ; i++){
        if(height[i]>leftMax){
            leftMax = height[i];
        }
        maxArrLeft[i] = leftMax;
        }

        for(int j = n -1 ; j >= 0 ; j--){
           if(height[j]>rightMax){
            rightMax= height[j];
           } 
           maxArrRight[j] = rightMax;
        }

        for(int i = 0 ; i < n ; i++){
     
        vol = vol +  Math.min(maxArrLeft[i],maxArrRight[i]) - height[i];  
        
           
    }
     return vol;
    
}
}