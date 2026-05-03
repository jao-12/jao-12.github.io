package introdução;
import java.util.Scanner;

public class soma {
    public static void main(String[]args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um numero");
    int a = scanner.nextInt();

    System.out.println("Digite um numero");
    int b = scanner.nextInt();

    System.out.println("A soma entre os numeros é " + (a + b));
    scanner.close();

    }
}