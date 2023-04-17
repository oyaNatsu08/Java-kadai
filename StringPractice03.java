package kadai2;

import java.util.Scanner;

public class StringPractice03 {
    public static void main(String[] args) {
        System.out.print("値を入力してください：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();

        System.out.println(s1.indexOf("s"));
        sc.close();
    }
}


