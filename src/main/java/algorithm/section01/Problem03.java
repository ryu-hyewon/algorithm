package algorithm.section01;

import java.util.Scanner;

public class Problem03 {

    public String solution(String str) {
        String answer = "";
        int m = 0;
        String[] s = str.split(" ");
        for(String x : s) {
            int len = x.length();
            if(len > m) {
                m = len;
                answer = x;
            }
        }

        return answer;
    }

    public String solution2(String str) {
        String answer = "";
        int m = 0, pos;
        while((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len > m) {
                m = len;
                answer = tmp;
            }
            str = str.substring(pos + 1);
        }
        if(str.length() > m) answer = str;

        return answer;
    }

    public static void main(String[] agrs) {
        Problem03 p = new Problem03();
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(p.solution2(str));
    }

}
