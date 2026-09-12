class Solution {
    public boolean isValidSudoku(char[][] board) {
        return checkRowAndColumn(board) && checkSquers(board);    
    }
    public boolean checkRowAndColumn(char[][] board){
        for(int i=0;i<9;i++){
            HashSet setRow = new HashSet();
            HashSet setCollumn = new HashSet();
            for(int j=0;j<9;j++){
                if(board[i][j]!='.'){
                    if(setRow.contains(board[i][j])) return false;
                    setRow.add(board[i][j]);
                }
                if(board[j][i]!='.'){
                    if(setCollumn.contains(board[j][i])) return false;
                    setCollumn.add(board[j][i]);
                }

            }
        }
        return true;
    }
    public boolean checkSquers(char[][] board){
        HashSet sq1 = new HashSet();
        HashSet sq2 = new HashSet();
        HashSet sq3 = new HashSet();
        HashSet sq4 = new HashSet();
        HashSet sq5 = new HashSet();
        HashSet sq6 = new HashSet();
        HashSet sq7 = new HashSet();
        HashSet sq8 = new HashSet();
        HashSet sq9 = new HashSet();
        for(int i=0;i<=2;i++){
            for(int j=0;j<=2;j++){
                if(board[i][j]!='.'){
                    if(sq1.contains(board[i][j])) return false;
                    sq1.add(board[i][j]);
                }
                if(board[i+3][j]!='.'){
                    if(sq2.contains(board[i+3][j])) return false;
                    sq2.add(board[i+3][j]);
                }
                if(board[i+6][j]!='.'){
                    if(sq3.contains(board[i+6][j])) return false;
                    sq3.add(board[i+6][j]);
                }
                if(board[i][j+3]!='.'){
                    if(sq4.contains(board[i][j+3])) return false;
                    sq4.add(board[i][j+3]);
                }
                if(board[i+3][j+3]!='.'){
                    if(sq5.contains(board[i+3][j+3])) return false;
                    sq5.add(board[i+3][j+3]);
                }
                if(board[i+6][j+3]!='.'){
                    if(sq6.contains(board[i+6][j+3])) return false;
                    sq6.add(board[i+6][j+3]);
                }
                if(board[i][j+6]!='.'){
                    if(sq7.contains(board[i][j+6])) return false;
                    sq7.add(board[i][j+6]);
                }
                if(board[i+3][j+6]!='.'){
                    if(sq8.contains(board[i+3][j+6])) return false;
                    sq8.add(board[i+3][j+6]);
                }
                if(board[i+6][j+6]!='.'){
                    if(sq9.contains(board[i+6][j+6])) return false;
                    sq9.add(board[i+6][j+6]);
                }
                
            }
        }
        return true;
    }
}   
