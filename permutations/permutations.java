class Solution {
    
        public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, nums, 0);
        return result;
    }
    
    public void dfs(List<List<Integer>> result, int[] nums, int index){
        if(index == nums.length){
            // List<Integer> combine = new ArrayList<>(Arrays.asList(nums));
            List<Integer> combine = new ArrayList<>();
            for(int num : nums){
                combine.add(num);
            }
            result.add(combine);
            return;
        }
        // index is the one we need to swap
        for(int i = index; i < nums.length; i++){
            swap(nums, index, i);
            dfs(result, nums, index + 1);
            swap(nums, index, i);
        }
        
    }
    
    public void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
        
    
}