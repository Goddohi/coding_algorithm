class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        int a;
        for(int i=0; i<s.length();i++){
            a = (int)s.charAt(i);
            for(int j=0;j<index;j++){
                a++;
                if(a>122){
                 a = a-26; 
                }
                if(skip.contains((char)a+"")){
                    j--;
                }
                
            }
            answer.append((char)a);
        }
        return answer.toString();
    }
}