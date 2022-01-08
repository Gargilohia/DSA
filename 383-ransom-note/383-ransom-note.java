class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int lenr = ransomNote.length();
        int lenm = magazine.length();
        if(lenr> lenm)
            return false;
        HashMap<Character,Integer> mg = new HashMap<>();
        for(int i=0;i<lenm;i++){
            char c = magazine.charAt(i);
            if(mg.containsKey(c)){
                int value = mg.get(c);
                mg.put(c, value+1);
            }
            else mg.put(c,1);
            
        }
        for(int i=0;i<lenr;i++){
            char c = ransomNote.charAt(i);
            if(mg.containsKey(c))
            {
                int value = mg.get(c);
                value-=1;
                if(value<0)
                    return false;
                else mg.put(c,value);
            }
            else return false;
        }
        return true;
    }
}