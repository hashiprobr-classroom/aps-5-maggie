package br.edu.insper.desagil.pi.pagogpt;

public class Prompt {

    /* Atributos:*/
    private String pergunta;
    private String resposta;

    /* pergunta pode ser lida: */
    public String getPergunta() {
        return pergunta;
    }

    /* resposta pode ser lida e escrita:*/
    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    /* Construção: */
    public Prompt(){
        this.pergunta = pergunta;
        this.resposta = null;
    }

    /* Metodo:*/
    /*@Override*/
    public double calculaPreco(){
        return 0.0;
    }
}
