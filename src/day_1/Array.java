package day_1;

// 항해99 코딩테스트 스터디 3기 - 1일차
// 자연수 뒤집어 배열로 만들기

class Array {
    public int[] array(long n) {
        String s = "" + n;  // long 타입 정수 n을 문자열로 변경
        int[] answer = new int[s.length()]; // answer 배열 선언

        int i=0; // 변수 i 선언

        while(n > 0) { // n이 0보다 크면 반복
            answer[i]=(int)(n%10); // 정수로 변환하고 n을 10으로 나눈 나머지를 배열에 넣기
            n /= 10; // n = n / 10
            i++; // i값 증가
        }

        return answer;
    }
}
