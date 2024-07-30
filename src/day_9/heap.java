import java.util.*;

// 항해99 코딩테스트 스터디 3기 - 9일차
// Relative Rank (상대적 순위)

public class heap {
    public String[] findRelativeRanks(int[] score) {
        String[] answer = new String[score.length];
        Integer[] scoreSort = new Integer[score.length];

        for (int i=0; i< score.length; i++) {
            scoreSort[i] = score[i];
        }

        Arrays.sort(scoreSort, Collections.reverseOrder());

        Map<Integer, String> rankMap = new HashMap<>();
        for (int i = 0; i < scoreSort.length; i++) {
            if (i == 0) {
                rankMap.put(scoreSort[i], "Gold Medal");
            } else if (i == 1) {
                rankMap.put(scoreSort[i], "Silver Medal");
            } else if (i == 2) {
                rankMap.put(scoreSort[i], "Bronze Medal");
            } else {
                rankMap.put(scoreSort[i], Integer.toString(i + 1));
            }
        }

        for (int i = 0; i < score.length; i++) {
            answer[i] = rankMap.get(score[i]);
        }

        return answer;
    }
}