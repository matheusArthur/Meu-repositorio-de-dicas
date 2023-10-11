import java.util.Scanner;
import java.util.Locale;
public class novo5 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char r ;
        do {
            System.out.print("Diigite a temperatura em celsius: ");
            double C = sc.nextDouble();
            double F = 9.0 * C / 5.0 + 32.0;
            System.out.println("O valor em fahrenheit é =" + F);
            System.out.println("Deseja repetir S/N");
            r = sc.next().charAt(0);
        }while(r == 's');
        sc.close();
    }
}
