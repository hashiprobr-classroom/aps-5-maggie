package br.edu.insper.desagil.pi.cobasi;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class DadosPet {

    /* Atributos: */

    /* Dicionario nome e tipo: */
    private Map<String, Integer> dados_pet = new HashMap<>();

    /* Pode ser lido por outros: */
    public Map<String, Integer> getDados_pet() {
        return dados_pet;
    }

    /* Constrtutor: */
    public DadosPet(){
        this.dados_pet = dados_pet;
    }

    private LocalDate dataNascimento;
    private double peso;
    private String extra;


}
