package br.edu.insper.desagil.pi.pagogpt;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PromptPagoTest {

    @Test
    void constroi() {
        PromptPago pp = new PromptPago("pergunta", 0.5);
        assertEquals("pergunta", pp.getPergunta());
        assertNull(pp.getResposta());
    }

    @Test
    void mudaResposta() {
        PromptPago pp = new PromptPago("qualquer", 0.2);
        pp.setResposta("resposta");
        assertEquals("resposta", pp.getResposta());
    }

    @Test
    void preco() {
        PromptPago pp = new PromptPago("pergunta", 0.1);
        // "pergunta" tem 8 caracteres -> 8 * 0.1 = 0.8
        assertEquals(0.8, pp.calculaPreco(), 0.01);
    }
}
