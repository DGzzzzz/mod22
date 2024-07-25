import java.util.List;

public class ClasseAllMatch {
    public static void main(String[] args) {
        List<Pessoa> lista = Pessoa.listaDePessoas();

        lista.stream()
            .allMatch(pessoa -> pessoa.getIdade() > 18);        // O método allMatch retorna true se todos os elementos da stream satisfazem a condição

        System.out.println("Todos são maiores de idade? " + lista.stream().allMatch(pessoa -> pessoa.getIdade() > 18));
    }
}
