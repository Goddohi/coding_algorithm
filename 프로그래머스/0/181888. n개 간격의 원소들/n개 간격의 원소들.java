class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer= new int[1+(num_list.length-1)/n];
        
        for(int i = 0;i*n<num_list.length;i++)
            answer[i]=num_list[i*n];
        
        return answer;
    }
}