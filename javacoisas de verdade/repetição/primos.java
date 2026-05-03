package repetição;

public class primos {
    public static void main(String[] args) {
        for (int i = 2; i <= 50; i++) {
            boolean Primo = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    Primo = false;
                    break;
                }
            }
            if (Primo) {
                System.out.println(i);
            }
        }
    }
}