class Solution {
    public int[][] solution(int[][] arr) {
        int len= Math.max(arr[0].length,arr.length);
        int[][] answer = new int[len][len];
        for(int i=0 ; i< arr.length;i++){
            for(int j=0 ; j< arr[i].length;j++){
                answer[i][j]=arr[i][j];
            }
        }
        return answer;
    }
}