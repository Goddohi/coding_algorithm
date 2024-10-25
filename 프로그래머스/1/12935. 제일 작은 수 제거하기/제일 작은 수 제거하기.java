class Solution {
    public int[] solution(int[] arr) {
        //1. 길이체크(길이가 1이하일경우 -1배열 반환 )
        if(1>=arr.length){
            int[] answer = {-1};
            return answer;
        }
        // 2.길이가 조건에 맞는다면 정답 배열 생성
        int[] answer = new int[arr.length-1];
        
        // 3. 최소값 설정후 최소값 구하기
        int min = arr[0];
        for(int a : arr ){
            if(a<min)
                min=a;
        }
        // 4. 정답배열에 주입
        int length=0;
        for(int a : arr ){
            if(a!=min)
                answer[length++]=a;
        }
        
        return answer;
    }
}