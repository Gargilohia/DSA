class Solution {
    public void moveZeroes(int[] nums) {
        int z=0;
        int n = nums.length-1;
        for(int i=0;i<=n;i++)
        {
            if(nums[i]!=0)
            {
                nums[z++]=nums[i];
            }
        }
        while(z<=n)
        {
            nums[z++]=0;
        }
    }
}