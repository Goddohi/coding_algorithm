class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int Esum=1,sum=0;
        for (int i : num_list){
            Esum*=i;
            sum+=i;
        }
        return Esum<(sum*sum)?1:0;
    }
}