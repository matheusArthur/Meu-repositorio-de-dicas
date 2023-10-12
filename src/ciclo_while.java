import java.util.Scanner;

public class ciclo_while {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        while (x!=0){
            x = sc.nextInt();
        }
        sc.close();
    }

}
