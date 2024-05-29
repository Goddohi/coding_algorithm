class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0,temp=0;
        
        for(int i=0;i<included.length;i++){
            temp= a+(d*i);
            if(included[i]==true)
                answer+=temp;
        }
        return answer;
    }
}