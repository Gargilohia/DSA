/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low =0;
        int high =n;
        if(n==1){
            return n;
        }
        if(n==2){
            if(isBadVersion(1)){
                return 1;
            }
            else return 2;
        }
        while(low<high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid)){
               
                    high=mid;
                }
                
            else low = mid+1;
        }
        return low;
    }
}