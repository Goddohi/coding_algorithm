class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int temp=1000001;
        
        for(int i=0; i<queries.length;i++){
            temp = 1000001;
            
            for (int k=queries[i][0];k<=queries[i][1];k++){
                if(queries[i][2]<arr[k] && arr[k]<temp){
                    temp=arr[k];
                }
                
            }
            answer[i] = (temp == 1000001) ? -1:temp;
        }
        return answer;
    }
}