class Solution {
    public int[] topKFrequent(int[] nums, int k) {
      HashMap <Integer ,Integer> map =  new HashMap <>();
      
      for(int x : nums){
        map.put(x,map.getOrDefault(x,0)+1);
      }


      List <List <Integer>> bucket = new ArrayList <>();

      for(int  i = 0 ;  i <= nums.length ;  i++){
        bucket.add(new ArrayList<>());
      }
      for(Map.Entry<Integer,Integer> entry : map.entrySet()){
        bucket.get(entry.getValue()).add(entry.getKey());
      }
      int [] ans =  new int [k];
      int index = 0 ;
      for(int i = nums.length ;  i >= 1 ; i--){
        for(int x : bucket.get(i)){
            ans[index++]=x;
            if(index == k ){
                return ans;
            }
        }
      }
return ans;
    }
}