class Solution {
    public int diagonalSum(int[][] mat) {
        int i=0, j=0, sum=0;
        while(i<mat.length){
            sum+=mat[i++][j++];
        }
        i=0;
        j--;
        while(i<mat.length){
            if(i!=j)
            {
                sum+=mat[i++][j--];
            }
            else{
                i++;
                j--;
            }
        }
        return sum;
    }
}