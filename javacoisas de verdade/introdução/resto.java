package introdução;
import java.util.Scanner;

public class resto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero");
        int a = scanner.nextInt();

        System.out.println("Digite outro numero");
        int b = scanner.nextInt();

        System.out.println("O resto da divisão entre os numeros é " + (a % b));
        scanner.close();
    }
}
