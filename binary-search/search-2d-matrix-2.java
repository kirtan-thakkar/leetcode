class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length-1;
        int j =0;

        while(i>=0 && j< matrix[0].length){
            if(matrix[i][j] > target){
                i--; // upar jav
            }else if(matrix[i][j] < target){
                j++; // right jav
            }else if(matrix[i][j] == target){
                return true;
            }else{
                return false;
            }
        }
        return false;
    }
}