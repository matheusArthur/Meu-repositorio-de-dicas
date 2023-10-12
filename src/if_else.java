import java.util.Scanner;

public class if_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um numero");
        int n1 = sc.nextInt();

        if (n1 < 5){
            System.out.println("é menor que 5");
        } else if (n1 > 5) {
            System.out.println("é maior que 5");
        }else {
            System.out.println(" é igual a 5");
        }
    }
}
