package condicionais;
import java.util.Scanner;

public class crescente {
    public static void main(String[] args) {
        Scanner num1 = new Scanner(System.in);
        System.err.println("Digite um numero: ");
        int num01 = num1.nextInt();

        Scanner num2 = new Scanner(System.in);
        System.err.println("Digite um numero: ");
        int num02 = num2.nextInt();

        Scanner num3 = new Scanner(System.in);
        System.err.println("Digite um numero: ");
        int num03 = num3.nextInt();

        int maior = 0;
        int menor = 0;
        int meio = 0;

        if(num01 > num02 && num01 > num03 ){
           maior = num01;
        }
        if(num01 < num02 && num01 < num03 ){
           menor = num01;
        }
        if(num02 > num01 && num02 > num03 ){
            maior = num02;
        }
        if(num02 < num01 && num02 < num03 ){
            menor = num02;
        }
        if(num03 > num02 && num03 > num01 ){
            maior = num03;
        }
        if(num03 < num02 && num03 < num01 ){
            menor = num03;
        }
        if(num01 != maior && num01 != menor){
            meio = num01;
        }
        if(num02 != maior && num02 != menor){
            meio = num02;
        }
        if(num03 != maior && num03 != menor){
            meio = num03;
        }
        
        System.out.println("A ordem é: " + menor + " " + meio + " " + maior);


        
    }
    
}