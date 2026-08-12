class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>(); 
        boolean[] check = new boolean[nums.length]; 
        List<Integer> perm = new ArrayList<>(); 
        findPermutations(nums, check, perm, result); 
        return result;
        
    }

    public void findPermutations(int[] nums, boolean[] added, List<Integer> permutation, List<List<Integer>> result) {
        if (permutation.size() == nums.length) {
            result.add(new ArrayList<>(permutation)); 
            return; 
        }

        for (int i = 0; i < nums.length; i++) {
            if (added[i] == false) {
                added[i] = true;
                permutation.add(nums[i]); 
                findPermutations(nums, added, permutation, result); 
                permutation.remove(permutation.size() -1); 
                added[i] = false; 

            }
        }
    }

}
