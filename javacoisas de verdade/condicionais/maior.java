package condicionais;
import java.util.Scanner;

public class maior {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.err.println("Digite um numero: ");
        int num01 = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.err.println("Digite um numero: ");
        int num02 = num2.nextInt();

        if(num01 > num02){
           System.out.println("O "+ num01 + " é o maior numero");
        } else {
            System.out.println("O "+ num02 + " é o maior numero");
        }
    }
}
