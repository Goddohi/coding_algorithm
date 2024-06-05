class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int temp=0;
        for (int[] i : queries){
            temp= arr[i[0]];
            arr[i[0]] = arr[i[1]];
            arr[i[1]] = temp;
            
        }
        return arr;
    }
}