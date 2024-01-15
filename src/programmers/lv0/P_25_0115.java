package programmers.lv0;

public class P_25_0115 {

    public static void main(String[] args) {
        int a1 = 5;
        int b1 = 3;
        int c1 = 3;
        int an = solution(a1, b1, c1);
        System.out.println(an);

    }

    private static int solution(int a, int b, int c){
        int answer = 0;
        int aa = (int) Math.pow(a,2);
        int bb = (int) Math.pow(b,2);
        int cc = (int) Math.pow(c,2);
        int aaa = (int) Math.pow(a,3);
        int bbb = (int) Math.pow(b,3);
        int ccc = (int) Math.pow(c,3);


        if (a != b && a != c && b != c){
            answer = a + b+ c;
        } else if (a == b && a == c) {
            answer = (a + b + c)*(aa + bb + cc)*(aaa + bbb + ccc);
        } else {
            answer = (a + b + c)*(aa+bb+cc);
        }

        return answer;
    }
}
