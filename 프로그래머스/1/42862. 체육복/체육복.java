class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        /*
        * 없는 친구        -1 
        * 자기꺼 가지는 친구 0 
        * 더가진친구       +1 
        */
        int[] nums = new int[n];
        for(int i : lost){ 
            nums[i-1] -= 1;
        }
        for(int i : reserve){
            nums[i-1] += 1;
        }
        
        
        for(int i=0 ; i<n ;i++){
            if(nums[i]==1){ //더 줄수있는친구
                answer++;
                //&&는 앞의 조건이 false일 경우 뒤에 조건을 검사하지 않으므로 i가 0일때
                //일어나는 길이 초과(nums[-1])이 일어나지 않음 
                if(i>0 && nums[i-1] == -1){ 
                    nums[i-1] +=  1 ;
                    answer++; //이전의 값이기 때문에 여기서 추가처리
                    continue; //이미 가지고있는 체육복사용했으므로 다음if문 가면 중복지급
                }
                if(i<n-1){
                     nums[i+1] += nums[i+1] == -1 ? 1 : 0;
                }
            }else if(nums[i]==0){ //본인것 가지고 있는 친구 
                answer++;
            }
        }
        return answer;
    }
}