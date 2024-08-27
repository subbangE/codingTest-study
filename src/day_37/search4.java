import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class search4 {

    // 항해99 코딩테스트 스터디 3기 - 37일차
    // 수학적 호기심

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력 받기
        StringTokenizer st = new StringTokenizer(br.readLine()); // 읽어오기
        int testCase = Integer.parseInt(st.nextToken()); // 총 반복수 확인

        for (int i=0; i<testCase; i++) { // 테스트 케이스만큼
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // n 받아오기
            int m = Integer.parseInt(st.nextToken()); // m 받아오기
            int cnt = 0; // 만족하는 쌍

            for (int a = 1; a < n - 1; a++) {
                for (int b = a + 1; b < n; b++) {
                    if ((a * a + b * b + m) % (a * b) == 0) { // 조건 확인
                        cnt++;
                    }
                }
            }
            // cnt 출력
            System.out.println(cnt);
        }

        br.close();
    }
}
