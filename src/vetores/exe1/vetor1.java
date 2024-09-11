package vetores.exe1;

import java.util.Scanner;

public class vetor1 {
    public static void main(String[] args) {



        System.out.println("enter the size of the vector");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] vect = new double [n];
        for (int i = 0; i < n; i++){
            System.out.println("enter size "+ (i+1) + ":");
            vect[i] = sc.nextDouble();
        }

        double sum = 0;
        for (int i = 0; i < n; i++){
            sum += vect[i];
        }
        double avg = sum /n;
        System.out.println("Media da altura " + avg);
        sc.close();
    }
}