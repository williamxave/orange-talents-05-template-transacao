package br.com.zupacademytransacoes.apitransacoes.repositories;

import br.com.zupacademytransacoes.apitransacoes.model.Transacao;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepositories extends JpaRepository<Transacao,String> {

   // @Query("select c from Transacao c where c.cartao.id = :id order by c.efetivadaEm desc")
    Page<Transacao> findTo10ByCartaoIdOrderByEfetivadaEmDesc(@Param("id") String id, Pageable pageable);
}
