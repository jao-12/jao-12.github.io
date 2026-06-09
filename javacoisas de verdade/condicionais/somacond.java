package condicionais;
import java.util.Scanner;
public class somacond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número");
        int a = scanner.nextInt();
        System.out.println("Digite outro número");
        int b = scanner.nextInt();

        if (a > b){
            System.out.println("A soma é " + (a + b));
        } else {
            System.out.println("A subtração é "+(a - b));
        }
        scanner.close();
    }
}
