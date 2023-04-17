package kadai2;

import java.util.Scanner;

public class MathPractice03 {
    public static void main(String[] args) {
        System.out.print("整数を入力してください：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var num1 = Integer.parseInt(s1);
        System.out.println(Math.abs(num1));
        sc.close();
    }
}
