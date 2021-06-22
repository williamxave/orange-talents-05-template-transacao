package br.com.zupacademytransacoes.apitransacoes.controllers;

import br.com.zupacademytransacoes.apitransacoes.customexceptions.DocumentException;
import br.com.zupacademytransacoes.apitransacoes.dto.TransacaoResponsePaginacao;
import br.com.zupacademytransacoes.apitransacoes.model.Transacao;
import br.com.zupacademytransacoes.apitransacoes.repositories.TransacaoRepositories;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cartao")
public class CartaoController {

    private TransacaoRepositories transacaoRepositories;

    public CartaoController(TransacaoRepositories transacaoRepositories) {
        this.transacaoRepositories = transacaoRepositories;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Page<TransacaoResponsePaginacao>> verUltimas10Transacoes(@PathVariable("id") String id,
                                                                                   @PageableDefault(size = 10) Pageable pageable
                                                                                    ) throws DocumentException {
        Page<Transacao> transacao = transacaoRepositories.findTo10ByCartaoIdOrderByEfetivadaEmDesc(id, pageable);
        if (transacao.isEmpty()) {
            throw new DocumentException(HttpStatus.NOT_FOUND, "Cartão inválido");
        }
        Page<TransacaoResponsePaginacao> transacaoResponsePaginacao = transacao.map(TransacaoResponsePaginacao::new);
        return ResponseEntity.ok(transacaoResponsePaginacao);
    }
}
