package br.com.fiap.entities;

public class Ciente {
    // visibilidae, tipo de dados e atributos
    private String nome; // Gabriel
    private String cpf; // 444.444.444-44
    private int idade; // 20
    private double altura; // 1.80

    // metodos setters (entrada) e metodos getters (retornar/exibir)


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
