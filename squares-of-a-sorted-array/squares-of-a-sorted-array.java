class Solution {
    public int[] sortedSquares(int[] nums) {
       int n = nums.length;
        
        int m;
        for(m=0;m<n;m++)
        {
            if(nums[m]>=0)
                break;
        }
        
        int i= m-1;
        int j=m;
        int index = 0;
        
        int[] temp = new int[n];
        while(i>=0 && j<n)
        {
            if(nums[i]*nums[i] < nums[j]*nums[j])
            {
                temp[index]= nums[i]*nums[i];
                i--;
            }
            else {
                temp[index]= nums[j]*nums[j];
                j++;
            }
            index++;
        }
        
        while(i>=0)
        {
            temp[index++] = nums[i]*nums[i];
            i--;
        }
        while(j<n)
        {
            temp[index++] = nums[j]*nums[j];
            j++;
        }
        
        for(int x=0;x<n;x++)
            nums[x]= temp[x];
        
        return nums;
    }
}