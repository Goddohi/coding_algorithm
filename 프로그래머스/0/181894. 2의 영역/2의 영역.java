class Solution {
    public int[] solution(int[] arr) {
        int start = -1,end=0;
        //맨처음 인덱스 직접탐색
        for(int i=0;i<arr.length;i++){
            if(arr[i]==2){
                start=i;
                break;
            }
        }
        //만약 2가 없을경우 바로 반환
        if(start==-1){
            int[] answer = {-1};
            return answer;
        }
        //마지막 인덱스 직접 탐색
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==2){
                end=i;
                break;
            }
        }
        //값넣기
        int[] answer = new int[1+end-start];
        for(int i=0;i<answer.length;i++){
            answer[i]=arr[start++];
        }
        return answer;
        //총 O(3n) = O(n)
    }
}