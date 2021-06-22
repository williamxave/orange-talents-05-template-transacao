package br.com.zupacademytransacoes.apitransacoes.dto;

import br.com.zupacademytransacoes.apitransacoes.model.Transacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TransacaoResponsePaginacao {

    private BigDecimal valor;
    private EstabelecimentoResponsePaginacao estabelecimento;
    private CartaoResponsePaginacao cartao;
    private LocalDate efetivadaEm;

    @Deprecated
    public TransacaoResponsePaginacao() {
    }

    public TransacaoResponsePaginacao(Transacao transacao) {
        this.valor = transacao.getValor();
        this.estabelecimento = new EstabelecimentoResponsePaginacao(transacao.getEstabelecimento());
        this.cartao = new CartaoResponsePaginacao(transacao.getCartao());
        this.efetivadaEm = transacao.getEfetivadaEm();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoResponsePaginacao getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoResponsePaginacao getCartao() {
        return cartao;
    }

    public LocalDate getEfetivadaEm() {
        return efetivadaEm;
    }
}
