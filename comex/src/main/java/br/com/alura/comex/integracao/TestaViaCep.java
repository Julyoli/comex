package br.com.alura.comex.integracao;

import java.sql.SQLOutput;

public class TestaViaCep {

    public static void main(String[] args) {


        String cep = "04313-002";

        ViaCepResponse retorno = new ViaCepService().buscaPorCep(cep);

        System.out.println(retorno);

    }
}
