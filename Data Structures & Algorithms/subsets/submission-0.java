class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> subset = new ArrayList<Integer>(); 
        findSubsets(0, nums, subset, result); 

        return result; 



    }

    public void findSubsets(int i, int[] nums, List<Integer> subset, List<List<Integer>> res ) {
        if (i == nums.length) {
            res.add(new ArrayList<Integer>(subset)); 
            return; 
        }

        subset.add(nums[i]); 
        findSubsets(i+1, nums, subset, res); 

        subset.remove(subset.size() - 1);
        findSubsets(i+1, nums,subset,res); 
    }



}
