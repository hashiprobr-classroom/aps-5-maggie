package br.edu.insper.desagil.pi.pagogpt;

public class Usuario {
<<<<<<< HEAD

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

=======
    private String email;
    private String nome;

    public Usuario(String email, String nome){
        this.email = email;
        this.nome = nome;

    }
    public String getEmail(){
        return email;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
>>>>>>> 45f8905823eb5abae567abe3ac5e9f2bf8291b34
}
