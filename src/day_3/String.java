package day_3;

public class String {
    public boolean solution(String s) {
        String str = s.toLowerCase();   // 문자열 s 의 모든 문자를 소문자로 바꿈
        int pcnt = 0;
        int ycnt = 0;

        for (int i=0; i < str.length(); i++) {    // 문자열 s 길이보다 작을때까지 반복
            char c = str.charAt(i); // 문자열 str 을 한문자씩 따와서 문자 c 에 선언
            if (c == 'p') {
                pcnt++; // 문자 c 가 'p' 와 같다면 pcnt 증가
            } else if (c == 'y') {
                ycnt++; // 문자 c 가 'y' 와 같다면 ycnt 증가
            } else {
                continue;   // 아니라면 계속 continue
            }
        }

        if  (pcnt != ycnt) {
            return false;   // pcnt 와 ycnt 값이 다르다면 false 리턴
        } else {
            return true;    // pcnt 와 ycnt 값이 같다면 true 리턴
        }
    }

}
