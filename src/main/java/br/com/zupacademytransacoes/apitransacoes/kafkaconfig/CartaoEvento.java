package br.com.zupacademytransacoes.apitransacoes.kafkaconfig;

import javax.validation.constraints.NotBlank;

public class CartaoEvento {

    @NotBlank
    private String id;

    @NotBlank
    private String email;

    public CartaoEvento(@NotBlank String id,
                         @NotBlank String email) {
        this.id = id;
        this.email = email;
    }

    @Deprecated
    public CartaoEvento() {
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

}