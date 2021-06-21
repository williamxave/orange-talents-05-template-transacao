package br.com.zupacademytransacoes.apitransacoes.repositories;

import br.com.zupacademytransacoes.apitransacoes.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransacaoRepositories extends JpaRepository<Transacao,String> {
}
