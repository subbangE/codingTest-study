public class search2 {

    // 항해99 코딩테스트 스터디 3기 - 30일차
    // Arranging Coins(동전 정리하기)

    public int arrangeCoins(int n) {
        int i = 0;  // 몇번째 행인지 알려주는 변수

        // n 이 0보다 크거나 같을때까지 반복
        while(n >= 0) {
            i++;    // 한번 돌때마다 1씩 증가
            n -= i;
        }

        return i - 1;   // 완전한 행의 수를 반환해야하기 때문에 -1
    }

}