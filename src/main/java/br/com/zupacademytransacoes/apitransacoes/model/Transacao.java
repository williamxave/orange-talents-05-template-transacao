package br.com.zupacademytransacoes.apitransacoes.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Transacao {

    @Id
    @NotBlank
    private String id;

    @NotNull
    private BigDecimal valor;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private Estabelecimento estabelecimento;

    @NotNull
    @OneToOne(cascade = CascadeType.ALL)
    private Cartao cartao;

    @NotNull
    private LocalDate efetivadaEm;

    @Deprecated
    public Transacao() {
    }

    public Transacao(@NotBlank String id,
                     @NotNull BigDecimal valor,
                     @NotNull Estabelecimento estabelecimento,
                     @NotNull Cartao cartao,
                     @NotNull LocalDate efetivadaEm) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public Estabelecimento getEstabelecimento() {
        return estabelecimento;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public LocalDate getEfetivadaEm() {
        return efetivadaEm;
    }
}
