// 8일차 미들러 문제 : 기능개발

import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int cnt = 0;
        int sub_cnt = 0;
        int sub_q = 0;
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> answer_q = new LinkedList<>();
        
        for (int i=0; i<progresses.length; i++) {
            q.add(progresses[i]);
        }
        
        for(int i=0; i<speeds.length; i++) {
             sub_q = q.peek();
            
            while (sub_q < 100) {           
                sub_q += speeds[i];
                cnt++;
            }

            // do while 문 : 한번은 무조건 실행 다음부터는 while보고 실행
            do {
                q.poll();   // stack : pop / queue : poll
                sub_cnt++;
            } while ( q.peek() != null && q.peek() + (speeds[i + sub_cnt] * cnt) >= 100);

            answer_q.add(sub_cnt);
            i += sub_cnt -1;
            cnt = 0;
            sub_cnt = 0;
        }
        
        int[] answer = new int[answer_q.size()];

        for (int i=0; i<answer.length; i++) { 
            answer[i] = answer_q.poll();
        }

        return answer;
    }
}
