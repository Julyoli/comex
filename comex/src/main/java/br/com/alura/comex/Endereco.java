package br.com.alura.comex;

import java.util.Objects;

public class Endereco {
    private String bairro;

    private String cidade;

    private String complemento;

    private String estado;

    private String rua;

    private int número;

    @Override
    public String toString() {
        return "Endereco{" +
                "bairro='" + bairro + '\'' +
                ", cidade='" + cidade + '\'' +
                ", complemento='" + complemento + '\'' +
                ", estado='" + estado + '\'' +
                ", rua='" + rua + '\'' +
                ", número=" + número +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return número == endereco.número && Objects.equals(bairro, endereco.bairro) && Objects.equals(cidade, endereco.cidade) && Objects.equals(complemento, endereco.complemento) && Objects.equals(estado, endereco.estado) && Objects.equals(rua, endereco.rua);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bairro, cidade, complemento, estado, rua, número);
    }
}

