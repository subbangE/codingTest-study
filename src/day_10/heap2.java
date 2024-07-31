import java.util.*;

// 항해99 코딩테스트 스터디 3기 - 10일차
// Kth Largest Element in a Stream (스트림에서 K번째로 큰 요소)

class KthLargest {
    private int k;
    private PriorityQueue<Integer> min;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        min = new PriorityQueue<>();    // 기본형: 우선순위가 낮은 숫자가 먼저 나옴 (작은 숫자)

        for (int num : nums) {
            add(num);
        }
    }

    public int add(int val) {

        if (min.size() < k) {
            min.offer(val);
        } else if (val > min.peek()) {
            min.poll();
            min.offer(val);
        }

        return min.peek();
    }
}