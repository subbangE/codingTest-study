import java.util.*;

// 항해99 코딩테스트 스터디 3기 - 7일차
// 같은 숫자는 싫어

public class stack {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();   // stack 스택 선언
        stack.add(arr[0]);  // stack 요소에 arr[0]값 추가

        for (int i=0; i<arr.length-1; i++) {
            if (arr[i] == arr[i+1]) {   // arr 배열의 인덱스 번호 i와 i+1이 같다면 continue
                continue;
            } else {    // 같지 않다면 인덱스 번호 i+1의 값을 stack 요소 추가
                stack.add(arr[i+1]);
            }
        }

        int[] answer = new int[stack.size()];   // answer 배열 stack 크기로 선언

        for (int j=0; j<stack.size(); j++) {
            answer[j] = stack.elementAt(j); // 요소 번호대로 배열에 추가
        }

        return answer;
    }
}