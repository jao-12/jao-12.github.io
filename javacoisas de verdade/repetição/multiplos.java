package repetição;
import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero");
        float num = scanner.nextInt();

        for (int i = 1; i <= 600; i += 6) {
            System.out.println(num * i);
        scanner.close();
        }
    }
}