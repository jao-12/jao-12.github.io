package repetição;
import java.util.Scanner;

public class senha {
    public static void main(String[] args) {
        String senha = ("wendel");

        Scanner scanner = new Scanner(System.in);
        String tentativa = ("");
        while(!tentativa.equals(senha)){
            System.out.println("Digite a senha");
            tentativa = scanner.nextLine();
            if(tentativa.equals(senha)){
                break;
            }
        }
        
        }
        

    }
