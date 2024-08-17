public class simulation2 {

    // 항해99 코딩테스트 스터디 3기 - 27일차
    // 공원 산책

    public int[] solution(String[] park, String[] routes) {
        int[] answer = {0,0};
        int num = 0;

        // S 부분 찾아서 answer 에 해당 좌표 넣기
        for(int i=0; i<park.length; i++) {
            if(park[i].indexOf('S') != -1) {
                answer[0] = i;
                answer[1] = park[i].indexOf('S');
                break;
            }
        }

        // E, W, S, N 별로 하나씩 움직여 보면서 park 에 벗어나지 않거나 지나가는 곳에 X 가 없을 경우 answer 좌표 변환
        for(int i=0; i<routes.length; i++) {

            num = Integer.valueOf(routes[i].charAt(2)) - 48;

            switch(routes[i].charAt(0)) {

                case 'E':
                    if(answer[1] + num < park[0].length()) {
                        for(int j=1; j<=num; j++) {
                            if(park[answer[0]].charAt(answer[1] + j) == 'X') {
                                break;
                            }

                            if(j == num) {
                                answer[1] += j;
                            }
                        }
                    }
                    break;

                case 'W':
                    if(answer[1] - num >= 0) {
                        for(int j=1; j<=num; j++) {
                            if(park[answer[0]].charAt(answer[1] - j) == 'X') {
                                break;
                            }

                            if(j == num) {
                                answer[1] -= j;
                            }
                        }
                    }
                    break;

                case 'S':
                    if(answer[0] + num < park.length) {
                        for(int j=1; j<=num; j++) {
                            if(park[answer[0] + j].charAt(answer[1]) == 'X') {
                                break;
                            }

                            if(j == num) {
                                answer[0] += j;
                            }
                        }
                    }

                    break;

                case 'N':
                    if(answer[0] - num >= 0) {
                        for(int j=1; j<=num; j++) {
                            if(park[answer[0] - j].charAt(answer[1]) == 'X') {
                                break;
                            }

                            if(j == num) {
                                answer[0] -= j;
                            }
                        }
                    }
                    break;
            }
        }

        return answer;
    }
}