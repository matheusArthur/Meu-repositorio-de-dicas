package exe1_estoque_classe.aplication;

import java.util.Locale;
import java.util.Scanner;

import exe1_estoque_classe.entities.Product;

public class program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Enter product fata : ");
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
