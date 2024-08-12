import java.util.*;

public class dp {

    // 항해99 코딩테스트 스터디 3기 - 21일차
    // Pascal's Triangle(파스칼 삼각형)

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    list.add(1);
                } else {
                    list.add(answer.get(i - 1).get(j - 1) + answer.get(i - 1).get(j));
                }
            }

            answer.add(list);
        }

        return answer;
    }
}