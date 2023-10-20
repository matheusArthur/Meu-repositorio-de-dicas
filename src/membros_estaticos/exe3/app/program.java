package membros_estaticos.exe3.app;

import membros_estaticos.exe3.calculo.volume2;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius");
        double radius = sc.nextDouble();

        double c = volume2.circumference(radius);
        double v = volume2.volume(radius);

        System.out.println("circumference" + String.format("%.2f",c));
        System.out.println("circumference" + String.format("%.2f",v));
        System.out.println("PI value is " + String.format("%.2f",volume2.PI));

        sc.close();
    }
}

