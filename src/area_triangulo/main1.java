package area_triangulo;

import java.util.Locale;
import java.util.Scanner;

import area_triangulo.calculo;

public class main1 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

       calculo x,y;
       x = new calculo();
       y = new calculo();

        System.out.println("Digite os parametros do triangulo x: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite os parametros do triangulo y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.println("triangulo x area -> " + areaX);
        System.out.println("triangulo x area -> " + areaY);

        if (areaX > areaY){
            System.out.println("A area maior é do triangulo x");
        }else {
            System.out.println("A area maior é do triangulo Y ");
        }
    }
}
