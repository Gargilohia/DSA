class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==0||n==2||n==3){
            return false;
        }
        if(n!=1 && n%4!=0){
            return false;
        }
        if(n==1){
            return true;
        }
        return isPowerOfFour(n/4);
    }
}