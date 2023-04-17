package kadai2;

import java.util.Scanner;

public class StringPractice04 {
    public static void main(String[] args) {
        System.out.print("3桁の数値を入力してください：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();

        boolean match = s1.matches("\\d{3}");
        System.out.println(match);

        sc.close();
    }
}

