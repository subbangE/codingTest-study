public class simulation {

    // 항해99 코딩테스트 스터디 3기 - 26일차
    // 바탕화면 정리

    public int[] solution(String[] wallpaper) {

        // answer = {answer 전체에서 #이 시작하는 인덱스 번호, answer 배열의 값들 안에서 #이 시작하는 인덱스 번호,
        //          전체에서 #이 마지막으로 끝나는 인덱스 번호, 배열 값들 안에서 #이 마지막으로 끝나는 인덱스 번호}

        int[] answer = {0, 0, 0, 0};    // answer 배열 초기화
        int start =  0; // # 이 제일 처음 시작하는 인덱스 번호
        int end = 0;    // # 이 제일 마지막 끝나는 인덱스 번호

        // start 처음값과, end 처음값 선언 및 answer 전체에서 #이 시작하는 인덱스 번호 찾기
        for (int i=0; i<wallpaper.length; i++) {
            if (wallpaper[i].contains("#")) {
                start = wallpaper[i].indexOf("#");
                end = wallpaper[i].lastIndexOf("#");
                answer[0] = i;
                answer[1] = start;
                answer[3] = end + 1;
                break;
            }
        }

        // answer 전체에서 #이 마지막으로 끝나는 인덱스 번호
        for (int i=wallpaper.length-1; i>=0; i--) {
            if (wallpaper[i].contains("#")) {
                answer[2] = i+1;
                break;
            }
        }

        // start와 end 값 찾기
        for (int i=0; i<wallpaper.length; i++) {
            if (start > wallpaper[i].indexOf("#") && wallpaper[i].indexOf("#") != -1) {
                start = wallpaper[i].indexOf("#");
                answer[1] = start;
            }
            if (end < wallpaper[i].lastIndexOf("#")) {
                end = wallpaper[i].lastIndexOf("#");
                answer[3] = end + 1;
            }
        }

        return answer;
    }
}