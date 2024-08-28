import java.util.*;

public int greedy4(String s) {

    // 항해99 코딩테스트 스터디 3기 - 38일차
    // Longest Palindrome

    Map<Character, Integer> map = new HashMap<>();
    int cnt = 0; // 문자열
    boolean check = false;  // 홀수가 있는지 없는지 확인용

    // HashMap에 데이터 삽입
    for (int i=0; i<s.length(); i++) {
        map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
    }

    // 맵의 키만큼 반복
    for (char c : map.keySet()) {
        // 짝수라면
        if (map.get(c) % 2 == 0) {
            cnt += map.get(c);
        } else {    // 홀수라면
            check = true;
            cnt += map.get(c) - 1;
        }
    }

    // 홀수가 있었다면 + 1
    if (check) {
        return cnt + 1;
    }

    // 없다면 그냥 출력
    return cnt;
}