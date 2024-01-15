package programmers.lv0;

public class P_24_0115 {

    public static void main(String[] args) {
        int pa = 3;
        int pd = 4;
        boolean[] pincluded = {true, false, false, true, true};
        int an = soulution(pa,pd,pincluded);
        System.out.println(an);

    }

    private static Integer soulution(int a, int d, boolean[] included){
        int answer = 0;
        for (int i = 0 ; i < included.length; i++){
            
            if (included[i] == true){
                answer += a;
                a += d;
            } else if (included[i] == false) {
                a += d;
            }
        }
        return answer;
    }
}
