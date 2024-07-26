# 문자열을 정수로 바꾸기(String)
> 2024-07-25 목요일 4일차

### 문제
+ 문제 설명
    + 문자열 s를 숫자로 변환한 결과를 반환하는 함수, solution을 완성하세요.

+ 제한 조건
    + s의 길이는 1 이상 5이하입니다.
    + s의 맨앞에는 부호(+, -)가 올 수 있습니다.
    + s는 부호와 숫자로만 이루어져있습니다.
    + s는 "0"으로 시작하지 않습니다.

+ 입출력 예
  + 예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다. 
  + str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.

### 오늘의 공부 포인트
+ Integer.valueOf(String) : Integer 클래스(객체)로 리턴하기 때문에 산술연산이 불가하고 음수는 지원 안됨.
+ Integer.parseInt(String) : int 형으로 리턴하기 때문에 null 값이 들어가면 안되고 음수 지원됨.

### 내가 푼 풀이
👉 [문제풀이](https://github.com/subbangE/codingTest-study/blob/master/src/day_4/String2.java)

### 내가 푼 풀이2
+ 한줄 코드 풀어서 한 버전
```
public static int solution(String s) {
  int answer = 0;
  char[] arr = new char[s.length()];
  
  for(int i=0; i<s.length(); i++) {
    arr[i] = s.charAt(i);
  }
  
  if (arr[0] == '-') {
    for(int j=1; j<s.length()-1; j++) {
      answer += Character.getNumericValue(arr[i]);
      answer *= 10;
    }
    answer += Character.getNumericValue(arr[i]);
    return -answer;
  } else {
    for (int i=0; i<s.length()-1; i++) {
      answer += Character.getNumericValue(arr[i]);
      answer *= 10;
    }
    answer += Character.getNumericValue(arr[i]);
    return answer;
  }
  
```

### 느낀점
기존에 Integer.parseInt() 메소드를 써봤음에도 불구하고 이 메서드가 음수도 지원되는지 몰랐는데 찾아보니 음수도 지원이 가능했었다!!
오늘 문제는 검색하느라 문제 풀이 시간이 조금 걸렸지만 역대급으로 짧은 코딩 문제였던 것 같다.
이번 기회에 자바 관련 여러 메소드들을 따로 한번 정리해서 공부해야겠다😭
