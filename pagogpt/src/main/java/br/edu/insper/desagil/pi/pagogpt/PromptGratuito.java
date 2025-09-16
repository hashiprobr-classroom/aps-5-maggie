package br.edu.insper.desagil.pi.pagogpt;

<<<<<<< HEAD
public class PromptGratuito extends Prompt {

    /* Atributos: */
    private int limite;

    /* Construtor: */
    public PromptGratuito(String pergunta, int limite){
        super(pergunta); /* herança*/
        this.limite = limite;
    }

    @Override
    public double calculaPreco(){
        double comp = getPergunta().length();
        if (comp < this.limite){
            return 0.0;
        }
        else {
            return comp;
        }
    }

=======
public class PromptGratuito {
>>>>>>> 45f8905823eb5abae567abe3ac5e9f2bf8291b34
}
