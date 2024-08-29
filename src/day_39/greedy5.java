import java.util.*;

public class greedy5 {

    // 항해99 코딩테스트 스터디 3기 - 39일차
    // Assign Cookies

    public int findContentChildren(int[] g, int[] s) {
        int answer = 0;
        int i = 0; // g index 값
        int j = 0; // s index 값

        // g랑 s 배열 정렬
        Arrays.sort(g);
        Arrays.sort(s);

        while(i < g.length && j < s.length ) { // index범위 확인
            if (g[i] <= s[j]) { // 조건 확인
                answer++;
                i++;
                j++;
            } else {
                j++;
            }

        }

        return answer;
    }
}