package Tarefa_Streams;

import java.util.List;

public class ClasseStreamPessoas {
    public static void main(String[] args) {
        List<Pessoas> imprimirTodos = Pessoas.listaDePessoas(); // Lista de todas as pessoas
        List<Pessoas> filtroFeminino = Pessoas.listaDePessoas(); // Lista de pessoas do sexo feminino

        System.out.println("Todas as pessoas: ");
        imprimirTodos.stream()
            .forEach(pessoas -> System.out.println("Nome: " + pessoas.getNome() + ", Sexo " + pessoas.getSexo()));

        // separador de impressão
        System.out.println("=====================================");

        System.out.println("Pessoas do sexo feminino: ");
        filtroFeminino.stream()
            .filter(pessoas -> pessoas.getSexo().equals("Feminino"))
            .forEach(pessoas -> System.out.println(pessoas.getNome()));
    }
}
