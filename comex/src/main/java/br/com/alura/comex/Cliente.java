package br.com.alura.comex;

public class Cliente {
    private String nome;

    private String cpf;

    private String email;

    private String profissão;

    private String telefone;

    private Endereco endereco;

    public Cliente(String nome, String cpf, String email, String profissão, String telefone, Endereco endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.profissão = profissão;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public Cliente(String alura, String number, String mail) {
    }
}
