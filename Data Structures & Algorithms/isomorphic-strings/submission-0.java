class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        for(int i= 0; i<s.length();i++){
            char x =  s.charAt(i);
            char y = t.charAt(i);

            if(!map.containsKey(x)&&!map.containsValue(y)){
                map.put(x,y);
                continue;
            }
            if(map.getOrDefault(x,'0')!=y){
                return false;
            }
        }
        return true;
    }
}