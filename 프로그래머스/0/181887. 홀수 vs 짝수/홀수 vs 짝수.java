class Solution {
    public int solution(int[] num_list) {
        int[] answer = {0,0};
        for(int i=0;i<num_list.length;i++){
            answer[i%2]+=num_list[i];
        }
            
        return answer[0]>=answer[1] ? answer[0] : answer[1] ;
    }
}