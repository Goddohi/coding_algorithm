import java.util.*;

class Solution {
    public int[] solution(String myString) {
        /*   myString.split("x",-1)   
           -1의 자리의 의미는 배열에서 문자열 수의 한계.
            만약 수가 제로라면, 정규 표현식에 맞는 모든 문자열이 출력
            -1, length 의경우는 끝까지 공백포함해서 출력
 */
        return Arrays.stream(myString.split("x",-1))
                     .mapToInt(x -> x.length())
                     .toArray();
    }
}