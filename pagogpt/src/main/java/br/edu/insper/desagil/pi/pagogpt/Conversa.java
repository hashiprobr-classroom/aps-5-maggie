package br.edu.insper.desagil.pi.pagogpt;

import java.util.ArrayList;
import java.util.List;

public class Conversa{

    /* Atributos: */
    private Usuario usuario;
    private List<Prompt> prompts;

    /* Usuario pode ser lido: */
    public Usuario getUsuario() {
        return usuario;
    }

    /* Construtor: */
    public Conversa(Usuario usuario){
        this.usuario = usuario;
        this.prompts = new ArrayList<>(); /* inicializada como vazia*/

    }

    /* Metodo adiciona: */
    public void adiciona (Prompt prompt){
        this.prompts.add(prompt);
    }

    /* Metodo calcula subtotal: */
    public double calculaSubTotal(){
        double soma = 0.0;
        for (Prompt prompt: prompts){
            soma += prompt.calculaPreco();
        }
        return soma;
    }

    /* Metodo calcula submedia: */
    public double calculaSubMedia(){
        if (prompts.isEmpty()){
            throw new IllegalStateException("Nenhum prompt!");
        }

        else {
            /* media: */
            return calculaSubTotal()/prompts.size();
        }
    }

}
