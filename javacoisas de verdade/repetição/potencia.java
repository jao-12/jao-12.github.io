package repetição;
import java.util.Scanner;

public class potencia {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num01 = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.out.println("Digite um numero");
        int num02 = num2.nextInt();

        double potencia = Math.pow(num01, num02); 
        System.out.println(potencia);
        num1.close();
        num2.close();
    }
}
