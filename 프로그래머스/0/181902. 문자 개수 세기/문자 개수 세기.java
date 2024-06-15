class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        //char[] charArr = my_string.toCharArray();
        for(int i=0 ; i<my_string.length();i++){      
            int ch = (int)my_string.charAt(i);
            if(ch>=97){
                ch =ch-97+26;
            }else{
               ch-=65;
            }
            answer[ch]++;
        }
         
        
        return answer;
    }
}