import java.util.Scanner;

public class exe3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero da soma");
        int n1 = entrada.nextInt();

        System.out.println("Digite o segundo numero da soma");
        int n2 = entrada.nextInt();

        int soma = n1 + n2;

        System.out.println("A soma de " +n1+ " e " +n2+ " é " + soma);

    }
}
