import java.util.*;

public class sort {
    public long solution(long n) {
        String s = n + "";  // 정수 n을 문자열로 바꿔줌
        String a = "";  // 배열 받아 줄 문자열 a

        String[] arr = new String[s.length()];  // 배열 arr 선언

        arr = s.split("");  // 문자열 s를 ""로 구분해서 배열 arr에 넣음

        Arrays.sort(arr, Collections.reverseOrder());   // 배열 arr을 내림차순으로 정렬

        for (int i=0; i<arr.length; i++) {
            a += arr[i];    // a = a + arr[i]
        }

        return Long.valueOf(a); // 문자열 a를 long 형태로 변환해서 리턴
    }
}