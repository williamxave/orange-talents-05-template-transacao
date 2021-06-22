package br.com.zupacademytransacoes.apitransacoes.handlerexceptions;

import br.com.zupacademytransacoes.apitransacoes.customexceptions.DocumentException;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class TratadorDeExceptionHandlerAdvice {

    @ExceptionHandler(DocumentException.class)
    public ResponseEntity<ValidadorPadrao> documentException(DocumentException documentException){
        var validadorPadrao =  new ValidadorPadrao(documentException.getStatusCode().value(),
                                                                "Erro de validação",
                                                                System.currentTimeMillis());
        validadorPadrao.addMensagem("Cartão", documentException.getMensagem());
        return  ResponseEntity.status(documentException.getStatusCode()).body(validadorPadrao);
    }
}
