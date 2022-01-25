class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        if(s.equals("") ){
            return true;
        }
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
}