package br.edu.insper.desagil.pi.pagogpt;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PromptGratuitoTest {

    @Test
    void precoCurto() {
        PromptGratuito pg = new PromptGratuito("pergunta", 10);
        assertEquals(0.0, pg.calculaPreco(), 0.00001);
    }

    @Test
    void precoLongo() {
        PromptGratuito pg = new PromptGratuito("pergunta longa", 10);

        assertEquals(14.0, pg.calculaPreco(), 0.00001);
    }
}

