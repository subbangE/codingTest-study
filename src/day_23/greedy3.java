import java.util.*;

public class greedy3 {

    // 항해99 코딩테스트 스터디 3기 - 23일차
    // Array Partition(배열 분할)

    public int arrayPairSum(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);

        for(int i=0; i<nums.length; i+=2) {
            answer += nums[i];
        }
        return answer;
    }
}