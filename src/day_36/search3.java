import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.*;

public class search3 {

    // 항해99 코딩테스트 스터디 3기 - 36일차
    // 적어도 대부분의 배수

    public static void main(String args[]) throws IOException {
        int cnt = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] nums = new int[5];

        for(int i=0; i<5; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        // 숫자 찾는 반복문
        for(int i=1; i>0; i++) {
            cnt = 0; // 확인 초기화 그래도 뜨는데 흠 아 예오

            // 확인 절차
            if(i%nums[0] == 0){
                cnt++;
            }
            if(i%nums[1] == 0){
                cnt++;
            }
            if(i%nums[2] == 0){
                cnt++;
            }
            if(i%nums[3] == 0){
                cnt++;
            }
            if(i%nums[4] == 0){
                cnt++;
            }

            // 세개 이상 만족 시 출력
            if(cnt > 2){
                System.out.print(i);
                break;
            }

        }
    }


}
