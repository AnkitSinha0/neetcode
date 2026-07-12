class Solution {
    public boolean isPalindrome(String s) {
      int left = 0;
      int right = s.length()-1;
      boolean res = true;
      while (left < right){
        if(!(Character.isLetterOrDigit(s.charAt(left)))){
            left++;
            continue;          
        }
        if(!(Character.isLetterOrDigit(s.charAt(right)))){
            right--;
            continue;
            
        }
        if(Character.toLowerCase(s.charAt(left))==Character.toLowerCase(s.charAt(right))){
            left++;
            right--;
            continue;
        }

        return false;
        

      }  
      return res;
    }
}