class Solution {
    public int romanToInt(String s) {
        int value=0;
        char[] ch = s.toCharArray();
        int i=0;
        while(i<s.length()){
            if(ch[i]=='I'){
                if(i+1<s.length()&&ch[i+1]=='V'){
                    value=value+4;
                    i=i+2;
                }
                else if(i+1<s.length()&&ch[i+1]=='X'){
                    value=value+9;
                    i=i+2;
                }
                else {value=value+1;
                      i++;
                     }
            }
            else if(ch[i]=='V'){
                value=value+5;
                i++;
            }
            else if(ch[i]=='X'){
                if(i+1<s.length()&&ch[i+1]=='L'){
                    value=value+40;
                    i=i+2;
                }
                else if(i+1<s.length()&&ch[i+1]=='C'){
                    value=value+90;
                    i=i+2;
                }
                else {value=value+10;
                      i++;
                     }
            }
            else if(ch[i]=='L'){
                value = value+50;
                i++;
            }
            else if(ch[i]=='C'){
                if(i+1<s.length()&&ch[i+1]=='D'){
                    value=value+400;
                    i=i+2;
                }
                else if(i+1<s.length()&&ch[i+1]=='M'){
                    value=value+900;
                    i=i+2;
                }
                else {value=value+100;
                      i++;
                     }
                
            }
            else if(ch[i]=='D'){
                value = value+500;
                i++;
            }
            else if(ch[i]=='M'){
                value = value+1000;
                i++;
                
            }
        }
        return value;
    }
}