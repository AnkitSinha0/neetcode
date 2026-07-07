class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
      List<List<String>> list = new ArrayList<>();
      HashMap<String,Integer> map =  new HashMap<>();

      for(int i = 0 ; i < strs.length;i++){

        char [] ch = strs[i].toCharArray();
        Arrays.sort(ch);
        String s = new String(ch);
        if(map.containsKey(s)){
            int x = map.get(s);
            list.get(x).add(strs[i]);

        }else{
            List<String> temp = new ArrayList<>();
            temp.add(strs[i]);
            list.add(temp);

            map.put(s,list.size()-1);
        }


      }

      return list;     
    }
}