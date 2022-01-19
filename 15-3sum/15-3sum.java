class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        
        if(nums.length<3)
            return list;
        Arrays.sort(nums);
        if(nums[0]>0)
            return list;
        int l = nums.length;
        
        int j;
        for(int i=0;i<l-2;i++)
        {
            int k=l-1;
            if(i+1==k)
                return list;
            else j = i +1;
            while(j<k){
                int sum = nums[i]+nums[j]+nums[k];
                if(sum==0)
                {
                    List<Integer> list2 = new ArrayList<Integer>();
                    list2.add(nums[i]);
                    list2.add(nums[j]);
                    list2.add(nums[k]);
                    if(!list.contains(list2))
                       list.add(list2);
                }
                if((nums[k]+nums[j]+nums[i])>=0)
                    k--;
                else j++;
        } 
    }
        return list;
}
}