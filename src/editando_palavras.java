public class editando_palavras {
    public static void main(String[] args) {

        String original = "a aa bcd FGH acc";

        //EM MINÚSCULAS
        String s1 = original.toLowerCase();
        System.out.println("em minúsculas -> "+s1);

        //EM MAIÚSCULAS
        String s2 = original.toUpperCase();
        System.out.println("em maiúsculas -> "+s2);

        //Cortar palavras
        String s3 = original.substring(2);
        String s4 = original.substring(3,6);
        System.out.println("somente escrever palavras a partir do segundo espaço -> "+s3);
        System.out.println("somente escrever palavras entre os espaços 3 e 6 -> -> "+s4);

        //SUBSTITUIR X POR Z
        String s5 = original.replace('a','c');
        String s6 = original.replace("aa","bb");
        System.out.println("Substituir a por c -> "+s5);
        System.out.println("Substituir aa por bb -> "+s6);

        //LOCALIZAR A PRIMEIRA E ULTIMA POSICAO QUE AS PALAVRAS X FORAM ENCONTRADAS * ter em atenção o int
        int s7 = original.indexOf("aa");
        int s8 = original.lastIndexOf("aa");
        System.out.println("localizar o espaço da primeira vez que a palavra aa foi escrita -> "+s7);
        System.out.println("localizar o espaço da ultima vez que a palavra aa foi escrita -> "+s8);

        //Dividir a frase em vetores
        String s ="Ola mundo kkk";
        String [] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);


    }
}
