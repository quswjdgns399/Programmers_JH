import java.util.*;
import java.util.stream.Stream;
class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int[] arr = Stream.of(String.valueOf(x).split(""))
	       .mapToInt(Integer::parseInt)
               .toArray();
        for(int i=0; i<arr.length;i++)
        {
            sum = sum + arr[i];
        }
        if(x%sum == 0)
            answer = true;
        else
            answer = false;
        return answer;
    }
}