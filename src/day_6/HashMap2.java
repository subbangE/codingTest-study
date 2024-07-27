import java.util.*;

// 항해99 코딩테스트 스터디 3기 - 6일차
// 폰켓몬

public class HashMap2 {
    public int solution(int[] nums) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();    // 해시맵 선언
        int cnt = nums.length/2;    // 최대로 뽑을 수 있는 갯수 'cnt' 선언

        for (int i=0; i<nums.length; i++) {
            // 키 : 포켓몬 번호, 값 : 번호에 해당하는 포켓몬 갯수
            // 포켓몬 번호가 동일할 경우 1 증가, 기본값은 0
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int key : map.keySet()) {  // key에 key값 반복해서 넣기
            answer += 1;    // 넣을때마다 answer 에 1증가
            if (answer == cnt) {    // answer이 최대로 뽑을 수 있는 갯수를 넘어가지 않도록 조건 설정
                return answer;  // answer과 cnt가 같다면 return
            }
        }
        return answer;  // cnt값과 같지 않고 더 작더라도 return
    }
}
