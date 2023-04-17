package kadai2;
import java.util.Scanner;
public class StringPractice01 {
    public static void main(String[] args) {
        System.out.print("文字を入力してください：");
        var sc = new Scanner(System.in);
        var s1 = sc.nextLine();
        var s2 = s1.toLowerCase();
        System.out.println(s2);
        sc.close();
    }
}

