import java.util.*;

// 항해99 코딩테스트 스터디 3기 - 12일차
// 문자열 내림차순으로 배치하기

public class sort2 {
    public String solution(String s) {
        String answer = "";

        String[] arr = s.split("");

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i=0; i < arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }
}