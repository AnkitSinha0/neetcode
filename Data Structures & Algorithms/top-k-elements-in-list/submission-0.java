class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        HashMap <Integer,Integer> map = new HashMap<>();
        List <Integer> arr =  new ArrayList<>();

        for(int x :  nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }

        List<Map.Entry<Integer,Integer>>  list= new ArrayList<>(map.entrySet());

        list.sort((a,b)->Integer.compare(b.getValue(),a.getValue()));

        for(int i = 0 ; i < k ; i++){
        
            arr.add(list.get(i).getKey());
        }
        int [] resArr = new int[arr.size()];
for(int i  =0  ; i < arr.size() ; i++){
    resArr[i] =  arr.get(i);
}
return resArr;
    }
}