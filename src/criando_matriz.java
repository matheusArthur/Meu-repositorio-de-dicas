import java.util.Scanner;

public class criando_matriz {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int [][] matriz = new int[2][2];


        for (int linha = 0; linha < 2; linha++) {
            for (int coluna = 0; coluna < 2; coluna++){
                System.out.println("Digite o valor para a posiçao("+linha+","+coluna+"):");
                matriz [linha][coluna] = scanner.nextInt();
            }

        }

        System.out.println("Matriz preenchida");
        for (int linha = 0; linha < 2; linha++){
            for (int coluna = 0; coluna < 2; coluna++){
                System.out.printf(matriz[linha][coluna] + " ");
            }

        }
        scanner.close();
        }
    }
