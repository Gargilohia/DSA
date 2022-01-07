class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] reshaped = new int[r][c];
        int row = mat.length;
        int col = mat[0].length;
        int m =0, n=0;
        if(row*col != r*c){ return mat; }
            for(int i=0;i<row;i++)
                for(int j=0;j<col;j++){
                  if(n>=c){
                        n=0;
                        m++;
                        reshaped[m][n] = mat[i][j];
                    }
                   
                    reshaped[m][n] = mat[i][j];
                    n++;
                }
            return reshaped;
        
    }
}