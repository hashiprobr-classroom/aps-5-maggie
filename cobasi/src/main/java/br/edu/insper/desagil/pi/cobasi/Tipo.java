package br.edu.insper.desagil.pi.cobasi;

import java.util.Map;

public class Tipo extends DadosPet {

    /* Atributos: */
    private Map<>
    if (tipo == 0) {
        summary += "Nascimento: " + dataNascimento.toString() + "\n";
        summary += "Peso: " + peso + "kg\n";
        summary += "Banho: " + extra + "\n";
    } else if (tipo == 1) {
        summary += "Nascimento: " + dataNascimento.toString() + "\n";
        summary += "Peso: " + peso + "kg\n";
        summary += "Doença: " + extra + "\n";
    } else if (tipo == 2) {
        summary += "Nascimento: " + dataNascimento.toString() + "\n";
        summary += "Peso: " + peso + "kg\n";
        summary += "Venenosa: " + Boolean.parseBoolean(extra) + "\n";
    } else if (tipo == 3) {
        summary += "Nascimento: " + dataNascimento.toString() + "\n";
        summary += "Peso: " + peso + "kg\n";
        summary += "Comida: " + Integer.parseInt(extra) + "\n";
}
