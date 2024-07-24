package Day_2;

// 항해99 코딩테스트 스터디 3기 - 2일차
// 평균 구하기

public class Array2 {
    public double solution(int[] arr) {
        double answer = 0;  // answer 실수로 변수 선언
        double sum = 0; // answer 실수로 변수 선언

        // 평균값 = (a + b + ...) / 더한값의 갯수
        for (int i=0; i<arr.length; i++) { // 각 배열의 값을 더하기 위해 for문 사용
            sum = sum + arr[i]; // 실수 sum에 정수 arr값을 더해 실수 sum에 선언
            answer = (double)(sum / arr.length); // 평균값을 구하기 위해 배열 길이 나누기
        }
        return answer;
    }
}
