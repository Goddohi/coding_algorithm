class Solution {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        boolean cnt = true;
        for(char c : s.toCharArray()){
            if(c==' '){
                cnt =true;  
            }else if(cnt){
                c = Character.toUpperCase(c);
                cnt = false;
            } else {
                c = Character.toLowerCase(c);
            }
                answer.append(c);
            } 
        return answer.toString();
        }
       
    /* //공백문자가 연속해서 나올 수 있습니다.
    public String jadenCase(String s){
        s = s.toLowerCase();
        char capitalFirstLetter = Character.toUpperCase(s.charAt(0));
    	return s.replace(s.charAt(0), capitalFirstLetter);
        
    }
    */
}