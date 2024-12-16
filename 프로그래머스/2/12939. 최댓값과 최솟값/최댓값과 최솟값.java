class Solution {
    public String solution(String s) {
        String answer = "";
        int max =  Integer.MIN_VALUE ,min = Integer.MAX_VALUE; 
        for(String num : s.split(" ")){
             if(Integer.parseInt(num)>max){
                 max = Integer.parseInt(num);
             }
            if(Integer.parseInt(num)<min){
                min = Integer.parseInt(num);
            }
        }
        return min+" "+max;
    }
}