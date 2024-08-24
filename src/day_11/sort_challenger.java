import java.util.*;

public class sort_challenger {
    public String solution(int[] numbers) {
        String answer = "";
        String temp = "";
        String[] arr = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            arr[i] = numbers[i] + "";
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                if ((i + 1) < arr.length && arr[i].charAt(0) == arr[i + 1].charAt(0) && arr[i].charAt(j) <= arr[i].charAt(0)) {
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
            
            answer += arr[i];
        }
        
        return answer;
    }


    public String solution2(int[] numbers) {
        String answer = "";
        String[] arr = new String[numbers.length];
        int[] sub_arr = new int[numbers.length];
        int sub_int = 0;

        for (int i = 0; i < numbers.length; i++) {
            arr[i] = numbers[i] + "";
        }

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < numbers.length; i++) {
            sub_arr[i] = Integer.valueOf(arr[i]);
        }

        for (int i = 0; i < numbers.length-1; i++) {
            if(sub_arr[i+1]%sub_arr[i]==0 && (sub_arr[i]/sub_arr[i+1]%10==0)){
                sub_int = sub_arr[i];
                sub_arr[i] = sub_arr[i+1];
                sub_arr[i+1] = sub_int;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            answer += String.valueOf(sub_arr[i]);
        }
        
        return answer;
    }
}
