package br.com.zupacademytransacoes.apitransacoes.handlerexceptions;

public class ErroPadrao {

    private Integer status;
    private String mensagem;
    private Long timeStamp;

    public ErroPadrao(Integer status,
                      String mensagem,
                      Long timeStamp) {
        this.status = status;
        this.mensagem = mensagem;
        this.timeStamp = timeStamp;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMensagem() {
        return mensagem;
    }

    public Long getTimeStamp() {
        return timeStamp;
    }

}