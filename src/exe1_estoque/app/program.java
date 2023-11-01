package exe1_estoque.app;

import exe1_estoque.stock.Product1;

import java.util.Locale;
import java.util.Scanner;

public class program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Name : ");
        String name = sc.nextLine();

        System.out.println("price : ");
        double price = sc.nextDouble();

        System.out.println("Quantity in stock: ");
        int quantity = sc.nextInt();

        System.out.println();
        Product1 product = new Product1(name,price,quantity);
        System.out.println("Enter the numbers of products to be add in stock: ");
        quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println("Enter the numbers of products to be remove from stock: ");
        quantity = sc.nextInt();
        product.removeProduct(quantity);

        System.out.println("update: " + product);

        System.out.println(product.toSting());

        sc.close();

    }
}
