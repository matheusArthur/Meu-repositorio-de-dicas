package array1;

public class ex1 {
    public static void main(String[] args) {

        String [] nome = new String[3];
        nome [0] = "maria";
        nome [1] = "andre";
        nome [2] = "matheus";

        for (int i = 0; i < 3; i++){
            System.out.println(nome[i]);
        }

        System.out.println("O nome.length automatiza o tamanho da variavel");
        for (String s : nome) {
            System.out.println(s);
        }

        System.out.println("ao usar nome = new String[3] vc esta recriando um novo array apagando todos os dados do array");
        nome = new String[3];
        for (String s : nome) {
            System.out.println(s);
        }
    }

}
