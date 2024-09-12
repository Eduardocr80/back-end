package br.edu.imepac.domain;

public class Aluno {

    private  String nome;
    private  String matricula;
    private  String email;

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
