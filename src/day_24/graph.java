public class graph {

    // 항해99 코딩테스트 스터디 3기 - 24일차
    // Find Center of Star Graph(별 그래프의 중심 찾기)

    public int findCenter(int[][] edges) {
        for (int i=1; i<edges.length; i++) {
            for (int j=0; j<3; j++) {
                if (j == 2) {
                    return edges[0][1];
                } else if (edges[i][j] == edges[0][0]) {
                    break;
                }
            }
        }
        return edges[0][0];
    }
}