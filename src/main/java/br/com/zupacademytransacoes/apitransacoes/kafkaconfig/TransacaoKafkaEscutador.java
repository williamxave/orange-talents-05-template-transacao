package br.com.zupacademytransacoes.apitransacoes.kafkaconfig;

import br.com.zupacademytransacoes.apitransacoes.model.Transacao;
import br.com.zupacademytransacoes.apitransacoes.repositories.TransacaoRepositories;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.converter.JsonMessageConverter;
import org.springframework.stereotype.Component;

@Component
public class TransacaoKafkaEscutador {

    private final Logger logger = LoggerFactory.getLogger(TransacaoKafkaEscutador.class);
    private TransacaoRepositories transacaoRepositories;

    public TransacaoKafkaEscutador(TransacaoRepositories transacaoRepositories) {
        this.transacaoRepositories = transacaoRepositories;
    }

    @Bean
    JsonMessageConverter jsonMessageConverter() {
        return new JsonMessageConverter();
    }

    @KafkaListener(topics = "${spring.kafka.topic.transacoes}")
    public void escutador(TransacaoKafkaEventoResponse transacaoKafkaEventoResponse){
        logger.info("Escutando");
        Transacao transacao = transacaoKafkaEventoResponse.toModel();
        transacaoRepositories.save(transacao);
    }
}
