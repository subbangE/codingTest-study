public class fullSearch {

    // 항해99 코딩테스트 스터디 3기 - 15일차
    // 모의고사

    public int[] solution(int[] answers) {
        int[] first = {1,2,3,4,5};
        int[] second = {2,1,2,3,2,4,2,5};
        int[] third = {3,3,1,1,2,2,4,4,5,5};

        int cnt1 = 0;
        int cnt2 = 0;
        int cnt3 = 0;

        for (int i=0; i<answers.length; i++) {
            if (answers[i] == first[i%5]) {
                cnt1++;
            }

            if (answers[i] == second[i%8]) {
                cnt2++;
            }

            if (answers[i] == third[i%10]) {
                cnt3++;
            }
        }

        if (cnt1 > cnt2 && cnt1 > cnt3) {
            int[] answer = new int[1];
            answer[0] = 1;
            return answer;
        } else if (cnt2 > cnt1 && cnt2 > cnt3) {
            int[] answer = new int[1];
            answer[0] = 2;
            return answer;
        } else if (cnt3 > cnt1 && cnt3 > cnt2) {
            int[] answer = new int[1];
            answer[0] = 3;
            return answer;
        } else if (cnt1 == cnt2 && cnt1 > cnt3) {
            int[] answer = new int[2];
            answer[0] = 1;
            answer[1] = 2;
            return answer;
        } else if (cnt2 == cnt3 && cnt2 > cnt1) {
            int[] answer = new int[2];
            answer[0] = 2;
            answer[1] = 3;
            return answer;
        } else if (cnt3 == cnt1 && cnt3 > cnt2) {
            int[] answer = new int[2];
            answer[0] = 1;
            answer[1] = 3;
            return answer;
        } else {
            int[] answer = new int[3];
            answer[0] = 1;
            answer[1] = 2;
            answer[2] = 3;
            return answer;
        }
    }
}