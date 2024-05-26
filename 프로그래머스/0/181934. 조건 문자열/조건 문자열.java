class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        boolean a = eq.equals("=") ? n==m : false;
        if(a==false)
            a = ineq.equals(">") ? n>m : n<m;
        return a?1:0;
    }
}