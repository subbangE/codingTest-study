import java.util.*;

// 항해99 코딩테스트 스터디 3기 - 12일차
// H-Index

public class sort2_middler {
    public int solution(int[] citations) {
        int cnt = 0;
        Arrays.sort(citations); // 0, 1, 2 ..

        for (int h=citations.length; h > 0; h--) {
            cnt = 0;
            for (int j=0; j<citations.length; j++) {
                if (citations[j] >= h) {
                    cnt++;
                }
            }
            if (cnt >= h) {
                return h;
            }
        }
        return 0;
    }
}