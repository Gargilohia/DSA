class Solution {
    public void sortColors(int[] nums) {
        int l = nums.length;
        int count0=0,count1=0;
        for(int i=0;i<l;i++)
        {
            if(nums[i]==0)
                count0++;
            else if(nums[i]==1)
                count1++;
        }
        int j=0;
        while(j<count0)
        {
            nums[j]=0;
            j++;
        }
        while(j<count0+count1)
        {
            nums[j]=1;
            j++;
        }
        while(j<l)
        {
            nums[j] = 2;
            j++;
        }
    }
}