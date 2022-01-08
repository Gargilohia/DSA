class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> ht = new HashMap<>();
        int len = s.length();
       
        for(int i=0;i<len;i++){
            char c = s.charAt(i);
       
            if(ht.containsKey(c)){
                int value = ht.get(c);
                ht.put(c, value+1);
            }
            else ht.put(c, 1);
        }
        for(int i=0;i<len;i++){
            if(ht.get(s.charAt(i))==1)
                return i;
        }
        return -1; 
    }
}