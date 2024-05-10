class Solution {
    public int[][] solution(int n) {
        int[] dx = {1,0,-1,0};
        int[] dy = {0,1,0,-1};
        int[][] answer = new int[n][n];
        int step=0,x=0,y=0;

        
        for(int i=0; i<n*n;i++){
         
            answer[y][x]=i+1;
            x+=dx[step];
            y+=dy[step];
          
           
            if(x==n){
                 x-=dx[step];
            y-=dy[step];
                step=1;
                 x+=dx[step];
                y+=dy[step];
            }else if(y==n){
                x-=dx[step];
                y-=dy[step];
                step=2;
                x+=dx[step];
                y+=dy[step];
            
            }
            else if(x==-1){
                x-=dx[step];
                y-=dy[step];
                step=3;
                 x+=dx[step];
                y+=dy[step];
    
            }
            else if(answer[y][x]!=0){
                if(step>=3){
                     x-=dx[step];
                    y-=dy[step];
                    step=0;
                     x+=dx[step];
                    y+=dy[step];
                }
                else{
                     x-=dx[step];
                    y-=dy[step];
                    step+=1;
                     x+=dx[step];
                    y+=dy[step];
                }
            }
            
       
           
       
        }
            
        return answer;
    }
}