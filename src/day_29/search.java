public class search {

    // 항해99 코딩테스트 스터디 3기 - 29일차
    // Missing Number(누락된 숫자)

    public int missingNumber(int[] nums) {
        int[] arr = new int[nums.length+1]; // 배열에 크기 + 1만큼 숫자를 순서대로 넣을 배열
        Arrays.sort(nums);  // nums 오름차순 정렬

        // arr에 nums.length + 1 만큼 숫자 순서대로 숫자 넣기
        for (int i=0; i<nums.length + 1; i++) {
            arr[i] = i;
        }

        // arr와 nums 비교했을때 숫자가 같지않으면 리턴
        for (int i=0; i<nums.length; i++) {
            if (arr[i] == nums[i]) {
                continue;
            } else {
                return arr[i];
            }
        }

        return arr[nums.length];
    }
}