class Solution {
    private int[] r = {-1,1,0,0};
    private int[] c = {0,0,-1,1};

    public boolean helper(int i,int j,char[][] board,int n,int m,int index,String word,int size,boolean[][] visited){
        if (index == size)
            return true;
        visited[i][j] = true;

        for(int a = 0; a<4;a++){
            int ur = i+r[a];
            int uc = j+c[a];
            if(ur>=0 && ur<n && uc >=0 && uc<m && !visited[ur][uc]){
                if(board[ur][uc] == word.charAt(index)){
                    if(helper(ur,uc,board,n,m,index+1,word,size,visited)){
                        return true;
                    }
                }
            }
        }
        visited[i][j] = false;
        return false;
    }

    public boolean exist(char[][] board, String word) {
        int n = board.length;
        int m = board[0].length;
        int size = word.length();
        boolean[][] visited = new boolean[n][m];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<m;j++){
                if(word.charAt(0) == board[i][j]){
                    if(helper(i,j,board,n,m,1,word,size,visited)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}