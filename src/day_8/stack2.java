import java.util.*;

public class stack2 {
    boolean solution(String s) {
        int ocnt = 0;   // '(' 갯수
        int ccnt = 0;   // ')' 갯수

        for (int i=0; i<s.length(); i++) {  // 문자열 s 길이까지 반복
            if (s.charAt(i) == '(') {
                ocnt++; // '('일 경우 ocnt 증가
            } else if (s.charAt(i) == ')') {
                ccnt++; // ')'일 경우 ccnt 증가
                if (ocnt < ccnt) {  // ocnt가 ccnt보다 작을 경우 false 리턴
                    return false;
                }
            }
        }

        if (ocnt == ccnt) { // ocnt와 ccnt가 같을 경우 true 리턴
            return true;
        }

        // ocnt가 ccnt보다 더 많을 경우 false 리턴
        return false;
    }
}