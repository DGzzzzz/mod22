import java.util.List;
import java.util.stream.Collectors;

public class ClasseCollect {
    public static void main(String[] args) {
        List<Pessoa> lista = Pessoa.listaDePessoas();

        lista.stream()
            .filter(pessoa -> pessoa.getNacionalidade().equals("Brasileiro"))
            .collect(Collectors.toList())
            .forEach(pessoa -> System.out.println("Nome: " + pessoa.getNome() + " - Nacionalidade: " + pessoa.getNacionalidade()));
    }
}
