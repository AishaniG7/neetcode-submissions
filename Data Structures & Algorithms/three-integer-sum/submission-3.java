class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); 
        HashSet<Integer> check = new HashSet<>();  

        for (int i = 0; i < nums.length; i++){

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue; 
            }

            int target = 0 - nums[i]; 
            int j = i + 1; 
            int k = nums.length - 1; 

            while (j < k) {
                if (nums[j] + nums[k] < target) {
                    j++; 
                } else if (nums[j] + nums[k] > target) {
                    k--; 
                } else {
                        System.out.println("Check passed"); 

                        List<Integer> temp = new ArrayList<>(); 
                        temp.add(nums[i]); 
                        temp.add(nums[j]); 
                        temp.add(nums[k]); 

                        result.add(temp); 

                        j++;
                        k--;  

                        while (j < k && nums[j] == nums[j - 1]) {
                            j++;
                        }

                        while (j < k && nums[k] == nums[k + 1]) {
                            k--;
                        }
                }

            }

        }

        return result; 
        
    }


}
