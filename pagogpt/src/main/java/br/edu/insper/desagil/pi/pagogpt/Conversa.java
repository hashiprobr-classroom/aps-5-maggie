package br.edu.insper.desagil.pi.pagogpt;

// Conversa.java
import java.util.ArrayList;
import java.util.List;

public class Conversa {
    private final Usuario usuario;
    private final List<Prompt> prompts;

    public Conversa(Usuario usuario) {
        this.usuario = usuario;
        this.prompts = new ArrayList<>();
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void adiciona(Prompt prompt) {
        this.prompts.add(prompt);
    }

    public double calculaSubTotal() {
        double soma = 0.0;
        for (Prompt p : prompts) {
            soma += p.calculaPreco();
        }
        return soma;
    }

    public double calculaSubMedia() {
        if (prompts.isEmpty()) {
            throw new IllegalStateException("Nenhum prompt!");
        }
        return calculaSubTotal() / prompts.size();
    }
}
