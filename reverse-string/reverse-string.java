class Solution {
    public void reverseString(char[] s) {
        helper(0,s);
        }
    private void helper(int index,char[] str){
        if(str==null||index>=str.length/2)
            return;
        helper(index+1,str);
        char c = str[str.length-index-1];
        str[str.length-index-1] = str[index];
        str[index] =c;
    }
    
}