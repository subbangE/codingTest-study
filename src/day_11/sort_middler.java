import java.util.*;

public class sort_middler {
    public String solution2(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> c1 = new LinkedList<>();
        Queue<String> c2 = new LinkedList<>();
        
        for (int i = 0; i < cards1.length; i++) {
            c1.add(cards1[i]);
        }

        for (int i = 0; i < cards2.length; i++) {
            c2.add(cards2[i]);
        }

        for (int i = 0; i < goal.length; i++) {
            if (goal[i].equals(c1.peek())) {
                c1.poll();
            } else if (goal[i].equals(c2.peek())) {
                c2.poll();
            } else {
                return "No";
            }
        }

        return "Yes";
    }

    // public String solution(String[] cards1, String[] cards2, String[] goal) {

    //     // 카드1과 카드2의 index를 알려줄 변수 2개
    //     int cnt_one = 0;
    //     int cnt_two = 0;

    //     for(int i=0;i<goal.length;i++){
    //         if(cnt_one<cards1.length && goal[i].equals(cards1[cnt_one])){ //카드 1과 비교 , 오버플로우 방지를위한 and조건 추가
    //             cnt_one++;
    //         }else if(cnt_two<cards2.length && goal[i].equals(cards2[cnt_two])){ //카드 1과 비교 , 오버플로우 방지를위한 and조건 추가
    //             cnt_two++;
    //         }else
    //             return "No";
    //     }

    //     return "Yes";
    // }
}
