package br.edu.insper.desagil.pi.pagogpt;

public class PromptGratuito extends Prompt {

    /* Atributos: */
    private int limite;

    /* Construtor: */
    public PromptGratuito(String pergunta, int limite) {
        super(pergunta); /* herança*/
        this.limite = limite;
    }

    @Override
    public double calculaPreco() {
        double comp = getPergunta().length();
        if (comp < this.limite) {
            return 0.0;
        } else {
            return comp;
        }
    }
}