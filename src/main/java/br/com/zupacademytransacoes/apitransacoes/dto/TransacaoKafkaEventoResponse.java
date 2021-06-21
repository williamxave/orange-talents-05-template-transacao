package br.com.zupacademytransacoes.apitransacoes.dto;

import br.com.zupacademytransacoes.apitransacoes.model.Cartao;
import br.com.zupacademytransacoes.apitransacoes.model.Estabelecimento;
import br.com.zupacademytransacoes.apitransacoes.model.Transacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TransacaoKafkaEventoResponse {

    private String id;
    private BigDecimal valor;
    private EstabelecimentoEvento estabelecimento;
    private CartaoEvento cartao;
    private LocalDate efetivadaEm;

    public TransacaoKafkaEventoResponse(String id,
                                        BigDecimal valor,
                                        EstabelecimentoEvento estabelecimento,
                                        CartaoEvento cartao,
                                        LocalDate efetivadaEm
                                        ) {
        this.id = id;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }

    @Deprecated
    public TransacaoKafkaEventoResponse() {
    }

    public Transacao toModel(){
        return new Transacao(
                this.id,
                this.valor,
                new Estabelecimento(
                        estabelecimento.getNome(),
                        estabelecimento.getCidade(),
                        estabelecimento.getEndereco()
                ),
                new Cartao(
                        cartao.getId(),
                        cartao.getEmail()
                ),
                this.efetivadaEm
        );

    }

    public String getId() {
        return id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoEvento getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoEvento getCartao() {
        return cartao;
    }

    public LocalDate getEfetivadaEm() {
        return efetivadaEm;
    }

}