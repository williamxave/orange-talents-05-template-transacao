package br.com.zupacademytransacoes.apitransacoes.customexceptions;

import org.springframework.http.HttpStatus;

public class DocumentException extends  RuntimeException{

    private HttpStatus statusCode;
    private String mensagem;

    public DocumentException(HttpStatus statusCode,
                             String mensagem) {
        super(mensagem);
        this.statusCode = statusCode;
        this.mensagem = mensagem;
    }

    public HttpStatus getStatusCode() {
        return statusCode;
    }

    public String getMensagem() {
        return mensagem;
    }
}