package br.edu.insper.desagil.pi.pagogpt;

public class Usuario {

    /* Atributos */
    private String email;
    private String nome;

    /* email e nome pode ser lido: */
    public String getEmail() {
        return email;
    }

    public String getNome(){
        return nome;
    }

    /* Construção:*/
    public Usuario (String email, String nome){
        this.email = email;
        this.nome = nome;
    }


}
