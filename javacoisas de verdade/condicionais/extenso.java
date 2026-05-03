package condicionais;

import java.util.Scanner;
import org.extenso.NumeroPorExtenso;

public class extenso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        System.out.println(NumeroPorExtenso.get(num));
    }
}
