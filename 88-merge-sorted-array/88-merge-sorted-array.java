class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int x=0;
        int y=0;
        while(x!=m+n && y!=n)
        {
            if(x<m && nums1[x]<=nums2[y]){
                x++;
            }
            else if(x<m && nums2[y] < nums1[x]){
                swap(nums1, nums2, x,y);
            }
            else{
                nums1[x]= nums2[y];
                x++;
                y++;
            }
        }
        
    }
    
    public void swap(int nums1[], int nums2[], int x, int y){
        int temp = nums2[y];
        nums2[y] = nums1[x];
        nums1[x]  = temp;
        
        while(y+1<nums2.length && nums2[y]>nums2[y+1]){
            temp = nums2[y+1];
            nums2[y+1] = nums2[y];
            nums2[y] = temp;
            y++;
        }
    }
}