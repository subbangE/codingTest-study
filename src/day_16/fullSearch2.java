public class fullSearch2 {

    // 항해99 코딩테스트 스터디 3기 - 16일차
    // 최소직사각형
    
    public int solution(int[][] sizes) {
        int max = 0;    // 제일 큰 값
        int minMax = 0; // 작은 값 중 제일 큰 값
        int[] min = new int[sizes.length];  // 작은 값 넣는 배열

        // 모든 값 중 제일 큰 값 찾는 for문
        for (int i=0; i<sizes.length; i++) {
            for (int j=0; j<sizes[i].length; j++) {
                if (max > sizes[i][j]) {
                    continue;
                } else {
                    max = sizes[i][j];
                }
            }
            
            // 이차원 배열에서 비교해 작은 값을 min 배열에 넣는 for문
            for (int l=0; l< sizes[i].length; l++) {
                if (l+1 >= sizes[i].length) {
                    break;
                }

                if (sizes[i][l] > sizes[i][l+1]) {
                    min[i] = sizes[i][l+1];
                } else {
                    min[i] = sizes[i][l];
                }
            }
        }

        // min 배열 중 제일 큰 값 찾는 for 문
        for (int i=0; i<min.length; i++) {
            if (minMax > min[i]) {
                continue;
            } else {
                minMax = min[i];
            }
        }

        return max * minMax;
    }
}