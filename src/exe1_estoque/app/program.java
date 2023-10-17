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

        System.out.println();

        System.out.println("Enter the numbers of products to be add in stock: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println("Enter the numbers of products to be remove from stock: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.println("update: " + product);

        System.out.println(product.toSting());

        sc.close();

    }
}
