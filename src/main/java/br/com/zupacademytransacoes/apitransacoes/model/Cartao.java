package br.com.zupacademytransacoes.apitransacoes.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Cartao {

    @Id
    @NotBlank
    private String id;

    @NotBlank
    private String email;

    public Cartao(@NotBlank String id,
                  @NotBlank String email) {
        this.id = id;
        this.email = email;
    }

    @Deprecated
    public Cartao() {
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

}
