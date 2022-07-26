class Solution {
    public int missingNumber(int[] nums) {
        int sum=0;
        int l = nums.length;
        for(int i=0;i<l;i++){
            sum = sum+nums[i];
        }
        int asum = l*(l+1)/2;
        return asum-sum;
    }
}