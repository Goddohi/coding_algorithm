class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health-attacks[0][1];
        int temp=0;
        for (int i =0; i<attacks.length-1;i++){
            temp = attacks[i+1][0]-(attacks[i][0]+1);
            
            answer += temp/bandage[0] *bandage[2] + temp*bandage[1];
            
             if(answer>health){
                answer=health;
            }
            answer -= attacks[i+1][1];
            if(answer<=0){
                answer=-1;
                break;
            }
            
          
        }
        return answer;
    }
}