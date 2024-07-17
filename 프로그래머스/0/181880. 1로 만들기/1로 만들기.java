class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        for(int num : num_list){
            while(true){
                if(num==1){
                break;
                }
                //홀수여도 오차피 나머지는 사라짐
                num /=2;
                answer++;
            }
        }
        return answer;
    }
}