class Solution {
    public int trap(int[] height) {
        int left = 0 ;
        int vol = 0;
        while(left < height.length){
        int lMax= height[left];
        int rMax = height[left];

        for(int i = left ;  i >= 0 ; i--){
            if(height[i]>lMax){
                lMax = height[i];
            }
        } 

        for(int j = left ; j < height.length; j++){
            if(height[j]>rMax){
                rMax = height[j];
            }

        }   
        vol = vol +  Math.min(lMax,rMax) - height[left];  
        left++;
           
    }
     return vol;
    
}
}