package membros_estaticos.exe2.app;

import membros_estaticos.exe2.calculo.volume1;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        volume1 volumee = new volume1();

        System.out.println("Enter radius");
        double radius = sc.nextDouble();

        double c = volumee.circumference(radius);
        double v = volumee.volume(radius);

        System.out.println("circumference" + String.format("%.2f",c));
        System.out.println("circumference" + String.format("%.2f",v));
        System.out.println("PI value is " + String.format("%.2f",volumee.PI));

        sc.close();
    }
}
