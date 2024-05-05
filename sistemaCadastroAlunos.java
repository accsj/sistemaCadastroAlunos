package edu.antonio.sistemaCadastroAlunos;
import java.util.ArrayList;
import java.util.Scanner;

public class sistemaCadastroAlunos {
    private static final ArrayList<Aluno> alunos = new ArrayList<>();
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String [] args) {
        boolean executando = true;
        while (executando) {
            System.out.println("\nSistema de Cadastro de Alunos");
            System.out.println("1. Adicionar Aluno");
            System.out.println("2. Remover Aluno");
            System.out.println("3. Listar Alunos");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    adicionarAluno();
                    break;
                case 2:
                    removerAluno();
                    break;
                case 3:
                    listarAlunos();
                    break;
                case 4:
                    executando = false;
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente");
            }
        }
        scanner.close();
    }

    private static void adicionarAluno() {
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a idade do aluno: ");
        int idade = Integer.parseInt(scanner.nextLine());
        System.out.print("Digite o número de notas do aluno: ");
        int numNotas = scanner.nextInt();
        double[] notas = new double[numNotas];
        for (int i = 0; i <numNotas; i++) {
            System.out.printf("Digite a nota %d: ", i + 1);
            notas[i] = scanner.nextDouble();
        }
        alunos.add(new Aluno(nome, idade, notas));
        System.out.println("\nAluno adicionado com sucesso!");
    }

    private static void removerAluno() {
        System.out.print("Digite o índice do aluno a ser removido: ");
        int indice = scanner.nextInt();
        if (indice >= 0 && indice < alunos.size()) {
            alunos.remove(indice);
            System.out.println("\nAluno removido com sucesso!");
        } else {
            System.out.println("Índice inválido, nenhum aluno removido.");
        }
    }

    private static void listarAlunos() {
        if (alunos.isEmpty()) {
            System.out.println("\nNenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos:");
            for (int i =0; i < alunos.size(); i++) {
                Aluno aluno = alunos.get(i);
                System.out.printf("[%d] %s - Idade: %d\n", i, aluno.getNome(), aluno.getIdade());
            }
        }
    }
}
