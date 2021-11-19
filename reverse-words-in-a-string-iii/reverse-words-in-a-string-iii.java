class Solution {
    public String reverseWords(String s) {
      StringBuilder str = new StringBuilder();
      String[] sn = s.split(" ");
      for(String word: sn)
          str.append(new StringBuffer(word).reverse().toString() + " ");
        return str.toString().trim();
    }
    
}