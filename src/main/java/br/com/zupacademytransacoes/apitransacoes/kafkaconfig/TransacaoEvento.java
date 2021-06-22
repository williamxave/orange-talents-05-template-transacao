package br.com.zupacademytransacoes.apitransacoes.kafkaconfig;

import br.com.zupacademytransacoes.apitransacoes.model.Cartao;
import br.com.zupacademytransacoes.apitransacoes.model.Estabelecimento;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

public class TransacaoEvento {

    @NotBlank
    private String id;

    @NotNull
    private BigDecimal valor;

    @NotNull
    private Estabelecimento estabelecimento;

    @NotNull
    private Cartao cartao;

    @NotNull
    private LocalDate efetivadaEm;

    public TransacaoEvento(@NotBlank String id,
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

    @Deprecated
    public TransacaoEvento() {
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