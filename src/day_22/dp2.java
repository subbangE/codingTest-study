import java.util.*;

public class dp2 {

    // 항해99 코딩테스트 스터디 3기 - 22일차
    // Pascal's Triangle 2(파스칼 삼각형 2)

    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> answer = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
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

        return answer.get(rowIndex);

    }
}