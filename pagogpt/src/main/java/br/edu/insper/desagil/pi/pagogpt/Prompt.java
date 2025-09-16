package br.edu.insper.desagil.pi.pagogpt;

public abstract class Prompt {

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
    public Prompt(String pergunta) {
        this.pergunta = pergunta;
        this.resposta = null;
    }

    /* Metodo abstrato pra ser usado por outras subclasses: */
    public abstract double calculaPreco();
}