class Solution {
    public boolean containsDuplicate(int[] nums) {
    Set<Integer> rep = new HashSet<Integer>();
    for(int i=0;i<nums.length;i++){
        if(!rep.add(nums[i]))
            return true;
    }
        return false;
    
}
}