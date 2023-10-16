package exe1_estoque.app;

import exe1_estoque.stock.Product1;

import java.util.Locale;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product1 product = new Product1();

        System.out.println("Name : ");
        product.name = sc.nextLine();

        System.out.println("price : ");
        product.price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        product.quantity = sc.nextInt();

        System.out.println(product.name + ", " + product.price +", " + product.quantity);

        sc.close();
    }
}
