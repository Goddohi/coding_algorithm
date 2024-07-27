import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Solution {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        Stream<String> stream = Arrays.stream(answer);
        answer= stream.filter(str -> !str.equals("")).toArray(String[]::new);
        return answer;
    }
}