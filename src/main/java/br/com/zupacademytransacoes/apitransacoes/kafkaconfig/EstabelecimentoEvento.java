package br.com.zupacademytransacoes.apitransacoes.kafkaconfig;

import javax.validation.constraints.NotBlank;

public class EstabelecimentoEvento{

    @NotBlank
    private String nome;
    @NotBlank
    private String cidade;
    @NotBlank
    private String endereco;

    public EstabelecimentoEvento(@NotBlank String nome,
                                  @NotBlank String cidade,
                                  @NotBlank String endereco) {
        this.nome = nome;
        this.cidade = cidade;
        this.endereco = endereco;
    }

    @Deprecated
    public EstabelecimentoEvento() {
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }

}