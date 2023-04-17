package kadai2;

import java.util.Scanner;

public class MathPractice04 {
    public static void main(String[] args) {
        System.out.print("1つ目の整数を入力してください：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var num1 = Integer.parseInt(s1);
        System.out.print("2つ目の整数を入力してください：");
        var s2 = sc.nextLine();
        var num2 = Integer.parseInt(s2);
        System.out.println(Math.max(num1, num2));
        sc.close();
    }
}
