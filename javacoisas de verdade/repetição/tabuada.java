package repetição;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        float num = scanner.nextInt();

    for (int i = 1; i <= 10; i++) {
        System.out.println(num / i);
    }
    for (int i = 1; i <= 10; i++) {
        System.out.println(num * i);
    }
    for (int i = 1; i <= 10; i++) {
        System.out.println(num + i);
    }
    for (int i = 1; i <= 10; i++) {
        System.out.println(num - i);
    }
    scanner.close();
    }
}
