package br.com.zupacademytransacoes.apitransacoes.handlerexceptions;

public class CampoDeMensagem {

    private String campo;
    private String mensagem;

    public CampoDeMensagem(String campo,
                           String mensagem) {
        this.campo = campo;
        this.mensagem = mensagem;
    }

    public String getCampo() {
        return campo;
    }

    public String getMensagem() {
        return mensagem;
    }
}
