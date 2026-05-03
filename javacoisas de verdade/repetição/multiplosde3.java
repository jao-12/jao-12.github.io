package repetição;
import java.util.Scanner;

public class multiplosde3 {
    public static void main(String[] args) {
        Scanner primnum = new Scanner(System.in);
        System.out.println("digite um numero");
        int num1 = primnum.nextInt();
        Scanner secnum = new Scanner(System.in);
        System.out.println("digite um numero");
        int num2 = secnum.nextInt();

        while(num1 <= num2){
            int soma = num1++;
            if ((soma % 3) == 0){
                System.out.println(soma);
            }
        }
    }
}
