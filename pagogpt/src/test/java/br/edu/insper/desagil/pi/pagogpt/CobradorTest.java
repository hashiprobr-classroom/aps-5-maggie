package br.edu.insper.desagil.pi.pagogpt;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CobradorTest {


    @Test
    void nenhumaValida() {


        Cobrador cobrador = new Cobrador(new ArrayList<>());
        Usuario u = new Usuario("x@x.com", "X");
        assertEquals(0.0, cobrador.calculaTotal(u), 0.00001);
    }

    @Test
    void umaValida() {
        Usuario ua = new Usuario("a@a.com", "A");
        Usuario ub = new Usuario("b@b.com", "B");
        Usuario uc = new Usuario("c@c.com", "C");

        Conversa ca = new Conversa(ua);
        ca.adiciona(new PromptPago("pergunta", 0.125)); // 8 * 0.125 = 1.0

        Conversa cb = new Conversa(ub);
        cb.adiciona(new PromptGratuito("pergunta longa", 10)); // 14.0

        Conversa cc = new Conversa(uc);
        cc.adiciona(new PromptPago("pergunta", 0.1)); // 0.8

        Cobrador cobrador = new Cobrador(Arrays.asList(ca, cb, cc));

        assertEquals(14.0, cobrador.calculaTotal(ub), 0.00001);
    }

    @Test
    void duasValidas() {
        Usuario ua = new Usuario("a@a.com", "A");
        Usuario ub = new Usuario("b@b.com", "B");

        Conversa ca = new Conversa(ua);
        ca.adiciona(new PromptPago("pergunta", 0.125)); // 1.0

        Conversa cb = new Conversa(ub);
        cb.adiciona(new PromptGratuito("pergunta longa", 10)); // 14.0

        Conversa cc = new Conversa(ua);
        cc.adiciona(new PromptPago("pergunta", 0.1)); // 0.8

        Cobrador cobrador = new Cobrador(Arrays.asList(ca, cb, cc));

        assertEquals(1.0 + 0.8, cobrador.calculaTotal(ua), 0.00001);
    }

    @Test
    void tresValidas() {
        Usuario u = new Usuario("z@z.com", "Z");

        Conversa c1 = new Conversa(u);
        c1.adiciona(new PromptPago("pergunta", 0.125)); // 1.0

        Conversa c2 = new Conversa(u);
        c2.adiciona(new PromptGratuito("pergunta longa", 10)); // 14.0

        Conversa c3 = new Conversa(u);
        c3.adiciona(new PromptPago("pergunta", 0.1)); // 0.8

        Cobrador cobrador = new Cobrador(Arrays.asList(c1, c2, c3));

        assertEquals(1.0 + 14.0 + 0.8, cobrador.calculaTotal(u), 0.00001);
    }
}

