class Solution {
        /*
        #########################################################################
        #                                                                       #
        #  =============================================                        #
        #                  SIDDARDHA CHILUVERU                                  #
        #  =============================================                        #
        #                                                                       #
        #  Author      : Siddardha Chiluveru                                    #
        #  Description : Solution / Code / Project                              #
        #  Date        : 2026-06-10                                             #
        #                                                                       #
        #########################################################################
        */
    public void solveSudoku(char[][] board) {
        solve(board);
    }

    public boolean solve (char[][] board) {
        for (int i = 0; i < 9; i++) // this is row
            for (int j = 0; j < 9; j++) // this si col
                if (board[i][j] == '.') {
                    for (char k = '1'; k <= '9'; k++)  // this is number in position 
                        if (val(board, i, j, k)) {
                            board[i][j] = k;
                            if (solve(board))
                                return true;
                            board[i][j] = '.';
                        }  
                    return false;
                }
        return true;
    }

    public boolean val(char[][] board, int i, int j, char k) {
        // line check
        for (int l = 0; l < 9; l++)
            if (board[i][l] == k)
                return false;
        // line check
        for (int l = 0; l < 9; l++)
            if (board[l][j] == k)
                return false;
        // 3 x 3 check
        int r3 = (i / 3) * 3;
        int c3 = (j / 3) * 3;
        for (int l = r3; l < r3 + 3; l++)
            for (int m = c3; m < c3 + 3; m++)
                if (board[l][m] == k)
                    return false;

        return true;    
    }
}