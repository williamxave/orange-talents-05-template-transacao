package br.com.zupacademytransacoes.apitransacoes.dto;

import br.com.zupacademytransacoes.apitransacoes.model.Estabelecimento;

public class EstabelecimentoResponsePaginacao {

    private String nome;
    private String cidade;
    private String endereco;

    public EstabelecimentoResponsePaginacao(Estabelecimento estabelecimento) {
        this.nome = estabelecimento.getNome();
        this.cidade = estabelecimento.getCidade();
        this.endereco = estabelecimento.getEndereco();
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
