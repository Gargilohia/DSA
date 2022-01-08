class Solution {
    public int search(int[] nums, int target) {
      int low =0;
        int high = nums.length -1;
        
        while(low<=high){
            int middle = low + (high-low)/2;
            
            if(nums[middle]==target)
                return middle;
            if(nums[middle]>=nums[low]){
                if(nums[middle]>target && target>=nums[low]){
                    high = middle-1;}
                else low=middle+1;
            }
            else{
                if(target>nums[middle] && target<=nums[high]){
                    low = middle+1;
                }
                else high = middle-1;
            }
        }
        return -1;
    }
    
}