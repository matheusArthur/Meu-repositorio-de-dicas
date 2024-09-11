package vetores.exe2.program;

import vetores.exe2.entites.product;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the size of the vector");
        int n = sc.nextInt();

        product[]  vect = new product[n];

        for (int i = 0; i < vect.length ; i++){
            sc.nextLine();
            String name = sc.nextLine();
            double price  = sc.nextDouble();
            vect[i]= new product(name, price);
        }
        double sum = 0;
        for (int i = 0; i < vect.length ; i++){
            sum += vect[i].getPrice();
        }
        double avg = sum / vect.length;
        System.out.print("media = "+ avg);



    }
}
