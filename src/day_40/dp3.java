public class dp3 {

    // 항해99 코딩테스트 스터디 3기 - 40일차
    // Min Cost Climbing Stairs

    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length; // n을 cost 배열의 길이로 선언
        int[] arr = new int[n]; // 최소 비용을 저장할 배열 선언

        arr[0] = cost[0]; // 첫 번째 비용 초기화
        arr[1] = cost[1]; // 두 번째 비용 초기화

        // 세 번째부터 n보다 작을때 반복
        for (int i = 2; i < n; i++) {
            // 최소 비용 계산, 현재 계단은 바로 인덱스 번호 i - 1 또는 i - 2에서 올 수 있음
            arr[i] = Math.min(arr[i-1] + cost[i], arr[i-2] + cost[i]);
        }

        // 인덱스 번호 i - 1 또는 i - 2에서 끝날 수 있으므로 이 두 경우 중에서 최소 비용을 반환
        return Math.min(arr[n-1], arr[n-2]);
    }

}