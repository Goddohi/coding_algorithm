class Solution {
    public boolean solution(String s) {
        try{
            if(s.length() ==4 ||  s.length() ==6){
                Integer.parseInt(s);
                return true;
            }else{
                 return false;
            }
        }catch(Exception e){
            return false;
        }
    }
}