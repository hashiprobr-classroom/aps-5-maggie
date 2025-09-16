package br.edu.insper.desagil.pi.pagogpt;

public class Usuario {

    /* Atributos */
    private String email;
    private String nome;

    /* email pode ser lido: */
    public String getEmail() {
        return email;
    }

    /* Nome pode ser lido e escrito:*/
    public String getNome(){
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /* Construção:*/
    public Usuario (String email, String nome){
        this.email = email;
        this.nome = nome;
    }

}
