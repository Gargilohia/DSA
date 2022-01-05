class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        ArrayList<Integer> arr=new ArrayList();
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                arr.add(nums1[i]);
                i+=1;
                j+=1;
            }
            else if(nums1[i]<=nums2[j]){
                i+=1;
            }
            else{
                j+=1;
            }
        }
        int n=arr.size();
        int ans[]=new int[n];
        for(int k=0;k<n;k++){
            ans[k]=arr.get(k);
        }
        return ans;
    }
}