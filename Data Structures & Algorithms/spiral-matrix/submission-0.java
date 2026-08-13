class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>(); 
        int length = matrix.length;
        int width = matrix[0].length;
        int sideBoundary = 0;
        int topBoundary = 1;  
        int size = length * width; 
        int index = 0; 
        int r = 0;
        int c = 0; 

        while (result.size() < size) {
            if (index == 0) {
                while (c < width) {
                    result.add(matrix[r][c]);
                    c++;
                }
                c--; 
                index = 1; 
                width--; 
                r++; 

            } else if (index == 1) {
                while (r < length) {
                    result.add(matrix[r][c]); 
                    r++; 
                }
                r--; 
                index = 2; 
                length--; 
                c--; 
            } else if (index == 2) {
                while (c >= sideBoundary) {
                    result.add(matrix[r][c]);
                    c--; 
                }
                c++; 
                index = 3;
                sideBoundary++; 
                r--; 
            } else if (index == 3) {
                while (r >= topBoundary) {
                    result.add(matrix[r][c]); 
                    r--; 
                }
                r++; 
                index = 0; 
                topBoundary++; 
                c++; 
            }
        }

        return result; 

    }
}
