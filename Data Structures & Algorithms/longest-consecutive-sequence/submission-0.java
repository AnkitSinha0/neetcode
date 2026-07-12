class Solution {
    public int longestConsecutive(int[] nums) {
     HashSet <Integer> set  = new HashSet<>();

     for(int x : nums){
        set.add(x);
     }
int res=0;
     for(int x : nums){
        if(set.contains(x-1)){
            continue;
        }
        int current=0;
        int m = x;
        while(set.contains(m)){
            current++;


            m++;    
        }
        if(current>res){
            res=current;
        }

     }

     return res;
    }
}
