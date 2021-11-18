class Solution {
    public void reverseString(char[] s) {
        int n = s.length-1;
        int low=0;
        int high = n;
        while(low<high)
        {
            char c = s[low];
            s[low]=s[high];
            s[high]= c;  
            low++;
            high--;
        }
    }
}