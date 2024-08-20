class Solution {
    public int solution(int n) {
        int answer = 1;
        boolean count =true;
        while(count){
            if(n% ++answer ==1){
                count = false; //break;해도됨
            }
        }
        return answer;
    }
}