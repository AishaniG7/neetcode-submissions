class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2]; 
        int pointerOne = 0;
        int pointerTwo = numbers.length - 1; 

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[pointerOne] + numbers[pointerTwo] == target) {
                res[0] = pointerOne + 1; 
                res[1] = pointerTwo + 1; 
            } else if (numbers[pointerOne] + numbers[pointerTwo] > target) {
                pointerTwo-=1; 
            } else if (numbers[pointerOne] + numbers[pointerTwo] < target) {
                pointerOne+=1; 
            }
        }

        return res; 
        
    }
}
