package Tarefa_Streams;

import java.util.List;

public class Pessoas { // Classe
    private String id;
    private String nome;
    private int idade;
    private String sexo;
    private String cidade;

    public Pessoas(String nome, int idade, String sexo, String cidade) { // Constructor
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.cidade = cidade;
    }


    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    // Lista de pessoas
    public static List<Pessoas> listaDePessoas() { 
        return List.of( // Método de criação de lista
            new Pessoas("Douglas", 30, "Masculino", "Uruguaio"), // Instâncias da classe Pessoa
            new Pessoas("Paulo", 25, "Masculino", "Brasileiro"),
            new Pessoas("João", 40, "Masculino", "Brasileiro"),
            new Pessoas("Maria", 35, "Feminino", "Brasileiro"),
            new Pessoas("José", 35, "Masculino", "Brasileiro"),
            new Pessoas("Ana", 25, "Feminino", "Brasileiro"),
            new Pessoas("Pedro", 45, "Masculino", "Brasileiro"),
            new Pessoas("Marta", 30, "Feminino", "Brasileiro"),
            new Pessoas("Carlos", 50, "Masculino", "Brasileiro"),
            new Pessoas("Júlia", 20, "Feminino", "Brasileiro")
        );
    }
}
