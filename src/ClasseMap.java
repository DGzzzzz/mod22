
import java.util.List;

public class ClasseMap {
    public static void main(String[] args) {
        List<Pessoa> lista = Pessoa.listaDePessoas();

        // fazer um map para pegar a nacionalidade e imprimir o nome e idade da pessoa
        lista.stream() // stream para percorrer a lista
            .map(pessoa -> pessoa.getNacionalidade()) // map para pegar a nacionalidade
             // imprime a nacionalidade
            .forEach(nacionalidade -> System.out.println(nacionalidade) );
    }
}
