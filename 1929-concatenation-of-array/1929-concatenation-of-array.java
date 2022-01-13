class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int dl = 2*len;
        int[] ans = new int[dl];
        for(int i=0;i<len;i++){
            ans[i] = nums[i];
            ans[i+len] =nums[i];
        }
        return ans;
    }
}