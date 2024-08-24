import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class dfs4 {

    // 항해99 코딩테스트 스터디 3기 - 34일차
    // 양 한마리... 양 두마리...

    // h와 w 전역변수
    static int h = 0;
    static int w = 0;

    public static void main(String args[]) throws IOException {
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in)); // 입력 받기
        StringTokenizer st = new StringTokenizer(b.readLine()); // 읽어오기
        int fieldCnt = Integer.parseInt(st.nextToken()); // 총 반복수 확인
        String fieldLine = ""; // st 저장

        //총 반복 수
        for (int i = 0; i < fieldCnt; i++) {

            st = new StringTokenizer(b.readLine()); // 다음줄

            List<List<Boolean>> arr = new ArrayList<>(); // 지도
            h = Integer.parseInt(st.nextToken()); // 높이
            w = Integer.parseInt(st.nextToken()); // 넓이
            int cnt = 0; // 양 무리 갯수 확인

            // field 생성
            for (int j = 0; j < h; j++) {
                arr.add(new ArrayList());
                st = new StringTokenizer(b.readLine()); // 다음줄
                fieldLine = st.nextToken();
                for (String a : fieldLine.split("")) {
                    if (a.equals("#")) { // 양이면 true 추가
                        arr.get(j).add(true);
                    } else { // 풀이면 false
                        arr.get(j).add(false);
                    }
                }
            }

            // field 확인
            for (int j = 0; j < h; j++) {
                for (int k = 0; k < w; k++) {
                    if (arr.get(j).get(k) == true) {
                        check(arr, k, j);
                        cnt++;
                    }
                }
            }

            System.out.println(cnt); // 양 무리 갯수 출력
        }
    }

    // 양 무리 확인
    public static void check(List<List<Boolean>> arr, int k, int j) {

        arr.get(j).set(k,false);

        // 가로 + 체크
        if(k+1 < w && arr.get(j).get(k+1).equals(true)) {
            check(arr, k+1, j);
        }

        // 가로 - 체크
        if(k-1 >= 0 && arr.get(j).get(k-1).equals(true)) {
            check(arr, k-1, j);
        }

        // 세로 + 체크
        if(j+1 < h && arr.get(j+1).get(k).equals(true)) {
            check(arr, k, j+1);
        }

        // 세로 - 체크
        if(j-1 >= 0 && arr.get(j-1).get(k).equals(true)) {
            check(arr, k, j-1);
        }

    }
}