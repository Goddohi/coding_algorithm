import java.util.Arrays;
class Solution {
    public String[] solution(String[] str_list) {
        String[] answer;
       int l= Arrays.asList(str_list).indexOf("l");
        int r=Arrays.asList(str_list).indexOf("r");
        if((l==-1 || l==0) && (r==-1||r==str_list.length)){
             answer = new String[0];
        }else{
            if(l==-1){answer =Arrays.copyOfRange(str_list, r+1, str_list.length);}
            else if(r==-1){answer =Arrays.copyOfRange(str_list, 0, l);}
            else{ answer = l>r ? Arrays.copyOfRange(str_list, r+1, str_list.length):Arrays.copyOfRange(str_list, 0, l);}
        }
        
        return answer;
    }
}