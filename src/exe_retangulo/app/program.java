package exe_retangulo.app;

import exe_retangulo.funcoes.area;

import java.util.Locale;
import java.util.Scanner;
public class program {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        area area1 = new area();

        System.out.println("Enter the following values");

        System.out.print("length: ");
        area1.length = sc.nextDouble();

        System.out.print("width: ");
        area1.width = sc.nextDouble();

        System.out.println("the area of the rectangle is " + area1.valueArea()+" and its perimeter is " + area1.perimeter());
    }
}
