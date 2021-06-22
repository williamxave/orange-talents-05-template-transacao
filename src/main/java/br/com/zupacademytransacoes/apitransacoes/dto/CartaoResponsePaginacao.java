package br.com.zupacademytransacoes.apitransacoes.dto;

import br.com.zupacademytransacoes.apitransacoes.model.Cartao;
import com.fasterxml.jackson.annotation.JsonCreator;

public class CartaoResponsePaginacao {

    private String email;

    @JsonCreator(mode = JsonCreator.Mode.PROPERTIES)
    public CartaoResponsePaginacao(Cartao cartao) {
        this.email = cartao.getEmail();
    }

    public String getEmail() {
        return email;
    }

}
