package br.com.zupacademytransacoes.apitransacoes.handlerexceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidadorPadrao extends ErroPadrao{

    private List<CampoDeMensagem> erros =  new ArrayList<>();

    public ValidadorPadrao(Integer status,
                           String mensagem,
                           Long timeStamp) {
        super(status, mensagem, timeStamp);
    }

    public List<CampoDeMensagem> getErros() {
        return erros;
    }

    public void addMensagem(String campoMensagem , String mensagem){
        erros.add(new CampoDeMensagem(campoMensagem,mensagem));
    }
}
