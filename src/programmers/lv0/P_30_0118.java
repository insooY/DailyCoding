package programmers.lv0;

public class P_30_0118 {
    public static void main(String[] args) {
        int [] case1 = {0,1,0,10,0,1,0,10,0,-1,-2,-1};
        String an = solution(case1);
        System.out.println(an);

    }

    private static String solution(int[] numlog){
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 1 ; i < numlog.length; i ++){
            switch (numlog[i] - numlog[i-1]){
                case 1 -> sb.append("w");
                case 10 -> sb.append("d");
                case -1 -> sb.append("s");
                case -10 -> sb.append("a");
            }
        }
        answer = sb.toString();
        return answer;
    }
}
