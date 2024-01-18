package programmers.lv0;

import java.util.Arrays;

public class P_31_0118 {
    public static void main(String[] args) {
        int [] arr1 = {0,1,2,3,4};
        int [][] queries1 = {{0,3},{1,2},{1,4}};
        int [] an = solution(arr1,queries1);
        System.out.println(Arrays.toString(an));
    }

    private static int[] solution(int[] arr, int[][] queries){
        int[] answer = {};
        int a,b,temp;

        for (int i = 0; i < queries.length; i++){
            a = queries[i][0];
            b = queries[i][1];

            temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
        }
        answer = arr;
        return answer;
    }
}
