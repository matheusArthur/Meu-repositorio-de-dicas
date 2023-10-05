import java.util.Scanner;

public class exe4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo numero");
        int n2 = scanner.nextInt();

        System.out.println("Digite o terceiro numero");
        int n3 = scanner.nextInt();

        int maior = Math.max(n1, Math.max(n2,n3));

        System.out.println("O maior numero é " + maior);

    }
}
