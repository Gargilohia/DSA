class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a = new int[2];
        int len = nums.length-1;
        int low=0, high = len;
        while(low<=high){
            int mid = low+ (high-low)/2;
            if(nums[mid]==target){
                int count=0;
                int save = mid;
               
                while(mid-1>=0 && nums[mid-1]==target)
                    mid--;
                
                
                while(save+1<=len && nums[save+1]==target)
                   save++;
                
                a[0] = mid;
                a[1] = save;
                return a; 
            }
            if(nums[mid]>target)
                high = mid-1;
            else low= mid+1;
        }
        a[0] = -1;
        a[1] = -1;
        return a;
    }
}