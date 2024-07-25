import java.util.List;

public class ClasseCount {
    public static void main(String[] args) {
        List<Pessoa> lista = Pessoa.listaDePessoas();

        Long quantidade = lista.stream()    // O método count retorna a quantidade de elementos da stream
            .filter(pessoa -> pessoa.getNacionalidade().equals("Brasileiro"))
            .count();

        System.out.println("Quantidade de elementos: " + quantidade);
    }
}

