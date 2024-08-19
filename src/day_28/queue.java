import java.util.*;

public class queue {

    // 항해99 코딩테스트 스터디 3기 - 28일차
    // 프로세스

    public int solution(int[] priorities, int location) {
        int cnt = 0;
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int p : priorities){
            q.add(p);
            pq.add(p);
        }

        while(!pq.isEmpty()){
            while(q.peek() != pq.peek()){
                q.add(q.poll());
                cnt++;
            }
            answer++;
            if(cnt % priorities.length == location){
                return answer;
            }
            q.poll();
            q.add(10);
            pq.poll();
            cnt++;
        }

        return answer;
    }
}