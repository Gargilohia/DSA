class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==0){
            return false;
        }
        if(n!=1 && n%2!=0){
            return false;
        }
        else if(n==1 ){
            return true;
        }
        else return isPowerOfTwo(n/2);
    }
}