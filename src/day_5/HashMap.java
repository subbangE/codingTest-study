package day_5;

import java.util.HashMap;
import java.util.Map;

// 항해99 코딩테스트 스터디 3기 - 5일차
// 완주하지 못한 선수
// 참가자 명단에 있는 이름 횟수를 값에 기록하고, 완주자 목록을 통해 이름 횟수(값)를 빼고난 후에도 남아 있는 사람을 찾아내는 방식으로 문제를 해결함

public class HashMap {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        // 문제에서 동명이인이 존재할 수 있다고 명시됨
        // 참가자 이름 : 키(string), 해당 이름의 참가자 수 : 값(integer)
        Map<String, Integer> map = new HashMap<String, Integer>(); // 해시맵 선언

        // 참가자 명단에 있는 이름을 p 에 반복해서 선언
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
            // 참가자 명단에 있거나 이미 존재하는 이름(키)이면 값을 +1, 없으면 0 (기본값)
            // map.put(키, 값) : 데이터 추가
        }

        // 완주자 명단에 있는 이름을 c 에 반복해서 선언
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
            // map에서 키(완주자 c 이름)에 해당하는 값을 가져와서 1을 빼기
        }

        for (String n : map.keySet()) { // map의 키를 n에 반복해서 선언
            if (map.get(n) > 0) {   // 키에 해당하는 값이 0보다 크면
                answer = n;         // answer 에 이름(키) 저장
                break;
            }
        }
        return answer;
    }
}
