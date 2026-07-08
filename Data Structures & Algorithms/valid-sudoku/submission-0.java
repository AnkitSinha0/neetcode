class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        HashSet <Character> set = new HashSet<>();

        for(char[] row : board){
            for(char x : row){
                if(x == '.'){
                    continue;
                }
                if(set.contains(x)){
                    return false;
                }
                
                set.add(x);
            }
          set.clear();
        }

          for(int i = 0 ; i < board.length ; i++){
              set.clear();
            for(int j = 0 ; j < board[i].length ; j++){

                char x = board[j][i];
                if(x == '.'){
                    continue;

                }

                if(set.contains(x)){
                    return false;
                }

                set.add(x);
            }
          }



          for(int box = 0 ; box < 9 ; box++){
            set.clear();
            int startRow = (box/3) *3;
            int startCol =  (box%3)*3;
            for(int i= startRow ; i < startRow+3 ; i++){
                for(int j = startCol ; j < startCol+3 ;j++){
                    char x  = board[i][j];
                    if(x == '.'){
                        continue;
                    }
                    if(set.contains(x)){
                        return false;
                    }
                    set.add(x);
                }
            }
          }


        

return true;

    }
}