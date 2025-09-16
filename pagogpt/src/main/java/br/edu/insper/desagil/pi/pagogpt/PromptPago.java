package br.edu.insper.desagil.pi.pagogpt;

public class PromptPago extends Prompt{

    /* Atributos: */
    private double fator;

    /* Construtor: */
    public PromptPago(String pergunta, double fator){
        super(pergunta);
        this.fator = fator;
    }

    /* Metodo:*/
    @Override
    public double calculaPreco(){
        return (getPergunta().length() * fator);
    }

}
