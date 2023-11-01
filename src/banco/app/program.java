package banco.app;

import banco.conta.funcoes;

import java.util.Objects;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        funcoes funcoes = new funcoes();
        String name;
        int num_account;
        int password;
        double i_money = 0;
        double w_money = 0;



        System.out.println("Hello,would you like to create an account?");
        String s = sc.nextLine();

        if (Objects.equals(s, "y"))
        {
            System.out.print("Enter your name: ");
            funcoes.name = sc.nextLine();
            System.out.print("Enter your account number: ");
            funcoes.num_account = sc.nextInt();
            System.out.print("Enter your password: ");
            password = sc.nextInt();

            System.out.print("initial deposit value? Y/N ");
            String s1 = sc.nextLine();

            if (Objects.equals(s1,"y")){
                i_money = sc.nextDouble();
                funcoes.insertMoney(i_money);
            }

            System.out.println(funcoes.toStingDeposit());
            System.out.println();

            System.out.print("Enter a deposit value: ");
            i_money = sc.nextDouble();
            funcoes.insertMoney(i_money);

            System.out.println(funcoes.toStingDeposit());
            System.out.println();

            System.out.print("Enter to withdraw value: ");
            w_money = sc.nextDouble();
            funcoes.withdrawMoney(w_money);

            System.out.println(funcoes.toStingWithdraw());
        } else {
            System.out.println("Bye");
        }

    }
}
