class Solution {
    public int Volume(int l , int w){
        return l * w;
    }
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int max = 0;
        int l , w = 0;
        while(left<right){
            if(heights[left]>heights[right]){
                l = heights[right];
            }else{
                l = heights[left];
            }
            w = right - left;
            int res = Volume(l,w);
            if(res>max){
                max = res;
            }
            if(heights[left]>heights[right]){
                right--;
            }else{
                left++;
            }

        }
        return max;
    }
}
