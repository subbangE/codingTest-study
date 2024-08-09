import java.util.Arrays;

public class greedy {
    
    // 항해99 코딩테스트 스터디 3기 - 19일차
    // 과일 장수
    
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int n = score.length;

        // 오름차순
        Arrays.sort(score);

        for (int i = n - m; i >= 0; i -= m) {
            int min = score[i];
            answer += min * m;
        }

        return answer;
    }
}