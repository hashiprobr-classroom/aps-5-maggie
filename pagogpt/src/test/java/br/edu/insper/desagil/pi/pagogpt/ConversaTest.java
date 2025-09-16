package br.edu.insper.desagil.pi.pagogpt;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConversaTest {

    @Test
    void subTotalVazio() {
        Usuario u = new Usuario("a@a.com", "A");
        Conversa c = new Conversa(u);
        assertEquals(0.0, c.calculaSubTotal(), 0.00001);
    }

    @Test
    void subTotal() {
        Usuario u = new Usuario("a@a.com", "A");
        Conversa c = new Conversa(u);

        // inteiro: 14.0
        Prompt p1 = new PromptGratuito("pergunta longa", 10);
        // 1 casa decimal: 0.8
        Prompt p2 = new PromptPago("pergunta", 0.1);
        // 2 casas decimais: 0.96
        Prompt p3 = new PromptPago("pergunta", 0.12);

        c.adiciona(p1);
        c.adiciona(p2);
        c.adiciona(p3);

        assertEquals(14.0 + 0.8 + 0.96, c.calculaSubTotal(), 0.01);
    }


    @Test
    void porPostVazio_tryCatch() {
        Usuario u = new Usuario("a@a.com", "A");
        Conversa c = new Conversa(u);

        try {
            c.calculaSubMedia();
            fail("Deveria ter lançado IllegalStateException");
        } catch (IllegalStateException erro) {
            assertEquals("Nenhum prompt!", erro.getMessage());
        }
    }

    @Test
    void porPost() {
        Usuario u = new Usuario("a@a.com", "A");
        Conversa c = new Conversa(u);

        Prompt p1 = new PromptGratuito("pergunta longa", 10); // 14.0
        Prompt p2 = new PromptPago("pergunta", 0.1);          // 0.8
        Prompt p3 = new PromptPago("pergunta", 0.12);         // 0.96

        c.adiciona(p1);
        c.adiciona(p2);
        c.adiciona(p3);

        double media = (14.0 + 0.8 + 0.96) / 3.0;
        assertEquals(media, c.calculaSubMedia(), 0.01);
    }
}