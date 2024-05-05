package edu.antonio.sistemaCadastroAlunos;

public class Aluno {
    private String nome;
    private int idade;
    private double[] notas;

    public Aluno(String nome, int idade, double[] notas) {
        this.nome = nome;
        this.idade = idade;
        this.notas = notas;
    }

    public String getNome() {
        return  nome;
    }

    public int getIdade() {
        return idade;
    }

    public double[] getNotas() {
        return notas;
    }
}
