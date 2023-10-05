import java.util.Scanner;

public class exe6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[2][2];
        int soma = 0;

        while (true) {
        System.out.println("----Menu----");
        System.out.println("1-> Preencher a matriz\n2-> Somar os numeros de uma coluno");
        System.out.println("Escolha uma opcao");
        int n1 = scanner.nextInt();

            switch (n1) {
                case 1:
                    for (int linha = 0; linha < 2; linha++) {
                        for (int coluna = 0; coluna < 2; coluna++) {
                            System.out.printf("Digite o valor para a posicao(" + linha + "," + coluna + ")");
                            matriz[linha][coluna] = scanner.nextInt();
                        }
                    }
                    for (int linha = 0; linha < 2; linha++) {
                        for (int coluna = 0; coluna < 2; coluna++) {
                            System.out.printf(matriz[linha][coluna] + " ");
                        }
                    }
                    break;

                case 2:
                    System.out.println("Digite o numero da coluna que deseja somar");
                    int n3 = scanner.nextInt();

                    for (int linha = 0; linha < 2; linha++) {
                        soma += matriz[linha][n3];
                    }

                    System.out.println("A soma da coluna " + n3 + " é: " + soma);
            }
        }
    }
}