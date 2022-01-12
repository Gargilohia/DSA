class Solution {
    public boolean isValid(String s) {
        if(s==null)
            return true;
        if(s.length()%2!=0)
            return false;
        int len = s.length();
        char[] c = s.toCharArray();
        int count=0;
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<len;i++){
            if(c[i]=='(' || c[i]=='{' || c[i]=='[')
            {
                stack.push(c[i]);
                count++;
            }
           else if(!stack.empty()){
               char m = stack.pop();
               switch(c[i]){
                   case '}':
                       if(m=='{')
                           count--;
                       else return false;
                       break;
                    case ')':
                       if(m=='(')
                           count--;
                       else return false;
                       break;
                    case ']':
                       if(m=='[')
                           count--;
                       else return false;
                       break;
               }
           }
            else return false;
        }
        if(count==0)
            return true;
        return false;
        
    }
}