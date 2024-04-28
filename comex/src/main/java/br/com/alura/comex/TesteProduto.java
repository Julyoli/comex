package br.com.alura.comex;

import org.apache.commons.collections.bag.SynchronizedSortedBag;

public class TesteProduto {
    public static void main(String[] args) {

        System.out.println("Teste de produto");

        Produto celular = new Produto();
        celular.setNome("Samsung SF20");
        celular.setDescricao("Android com 128GB");
        celular.setPrecoUnitario(3.395);
        celular.setQuantidade(10);

        Produto celular2 = new Produto();
        celular2.setNome("Samsung SF20");
        celular2.setDescricao("Android com 128GB");
        celular2.setPrecoUnitario(3.395);
        celular2.setQuantidade(5000);

        System.out.println("Produto 1" + celular);
        System.out.println("Produto 2" + celular2);


//Compare dois produtos
        if (celular.equals(celular2)) {
            System.out.println("Sao iguais!");
        } else {
            System.out.println("Nao sao iguais!");

        }
    }
}
