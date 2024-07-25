
import java.util.List;

public class Pessoa { // Classe
    private String id;
    private String nome;
    private String nacionalidade;
    private int idade;

    public Pessoa(String id, String nome, String nacionalidade, int idade) { // Constructor
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Lista de pessoas
    public static List<Pessoa> listaDePessoas() { 
        return List.of( // Método de criação de lista
            new Pessoa("1", "Douglas", "Uruguaio", 30), // Instâncias da classe Pessoa
            new Pessoa("2", "Paulo", "Brasileiro", 25),
            new Pessoa("3", "João", "Brasileiro", 40),
            new Pessoa("4", "Maria", "Brasileiro", 35),
            new Pessoa("5", "José", "Brasileiro", 35)
        );
    }
}
