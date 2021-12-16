package InterviewQuestions;
/**Determine if a 9 x 9 Sudoku board is valid. Only the filled cells
 * need to be validated according to the following rules:

 Each row must contain the digits 1-9 without repetition.
 Each column must contain the digits 1-9 without repetition.
 Each of the nine 3 x 3 sub-boxes of the grid must contain the digits
 1-9 without repetition.
 * */
public class ValidSudoku {
    public boolean isValidSudoku(char[][] board) {

        for (int i = 0; i < board[0].length; i++){
            for (int j = 0; j < board[0].length; j++){
                if (board[i][j] != '.'){
                    char cur = board[i][j];
                    
                    for (int k = j + 1; k < board[0].length - j; k++){
                        if (board[i][k] == cur) return false;
                    }
                    for (int k = i + 1; k < board[0].length - i; k++){
                        if (board[k][j] == cur) return false;
                    }
                }
            }
        }
        return true;
    }
}
