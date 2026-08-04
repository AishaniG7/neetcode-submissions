class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] solution = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>(); 

        for (int i = 0; i < nums.length; i++) {
            int difference = target - nums[i]; 

            if (map.containsKey(difference)) {
                solution[0] = map.get(difference);
                solution[1] = i; 
                 
            } else {
                map.put(nums[i], i); 
            }

        }

        return solution; 

        
    }
}
