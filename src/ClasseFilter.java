
import java.util.List;


public class ClasseFilter {
    public static void main(String[] args) {
        List<Pessoa> lista = Pessoa.listaDePessoas(); // Criação de lista de pessoas a partir do método listaDePessoas da classe Pessoa
        lista.stream() // Criação de stream
        .filter(pessoa -> pessoa.getNacionalidade() // Filtragem de nacionalidade
        .equals("Uruguaio")) // igual a tal Nacionalidade
        .forEach(pessoa -> System.out.println(pessoa.getNome())); // Impressão do nome de cada pessoa
    }
}
