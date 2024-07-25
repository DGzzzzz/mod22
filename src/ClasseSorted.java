import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ClasseSorted {
    public static void main(String[] args) {
        List<Pessoa> lista = Pessoa.listaDePessoas();

        Stream<Pessoa> orderIdade = lista.stream()
            .filter(pessoa -> pessoa.getNacionalidade().equals("Brasileiro"))
            .sorted(Comparator.comparing(Pessoa::getIdade)); // Ordenação por idade "maior para menor"

        Stream<Pessoa> orderNome = lista.stream()
            .filter(pessoa -> pessoa.getNacionalidade().equals("Brasileiro"))
            .sorted(Comparator.comparing(Pessoa::getNome)); // Ordenação por nome    

        Stream<Pessoa> orderIdadeMenor = lista.stream()
            .filter(pessoa -> pessoa.getNacionalidade().equals("Brasileiro"))
            .sorted(Comparator.comparing(Pessoa::getIdade).reversed()); // Ordenação reversa

        // imprimir cada resultado
        System.out.println("Ordenação por idade");
        orderIdade.forEach(pessoa -> System.out.println(pessoa.getNome() + " - " + pessoa.getIdade()));
        System.out.println("Ordenação por nome");
        orderNome.forEach(pessoa -> System.out.println(pessoa.getNome() + " - " + pessoa.getIdade()));
        System.out.println("Ordenação por idade (menor para maior)");
        orderIdadeMenor.forEach(pessoa -> System.out.println(pessoa.getNome() + " - " + pessoa.getIdade()));    
    }
}
