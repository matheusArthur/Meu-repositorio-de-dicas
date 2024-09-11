package arrayList;

import java.util.ArrayList;

public class array1 {
    public static void main(String[] args) {
        ArrayList <String> carros = new ArrayList<>(100); //iniciado com 100 apenas para demonstracao

        carros.add("ola");
        carros.add("tudo");
        carros.add("bem");
        carros.add(0,"car");

        //Serve para mostrar a posicao da palavra desejada
        System.out.println(carros.indexOf("ola"));
        // retorna "true" no console simbolizando que a remoção foi bem sucedida
        System.out.println(carros.remove("ola"));
        // No começo do codigo iniciamos o arraylist com 100 de espaço e para o nosso ciclo for
        // nao repetir o ciclo 100 vezes usamos esse codigo que apaga os espaços que não estão sendo utlizados
        carros.trimToSize();

        // apagado todos os dados o codigo a baixo
        // carros.clear();
        /* ambas servem para mostrar os dados. opcao 1 ->*/
        for (String a:carros) {
            System.out.println(a);
        }
        /*opcao 2 ->*/
        /*for (int i=0; i<carros.size();i++) {
            System.out.println(carros.get(i));
        }*/
    }
}
