import java.util.*;
import java.util.stream.Stream;
import java.util.Collections;

class Solution {
    public long solution(long n) {
        long answer = 0;
        String[] arr = Long.toString(n).split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        String answ="";
        
        for(String s : arr)
            answ += s;
        
        answer = Long.parseLong(answ);
        
        return answer;
    }
}