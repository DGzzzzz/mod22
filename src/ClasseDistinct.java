import java.util.List;

public class ClasseDistinct {
    public static void main(String[] args) {
        List<Pessoa> lista = Pessoa.listaDePessoas(); 
        
        // pega a lista de pessoas e filtra por nacionalidade e usa o distinct para pegar somente os valores únicos
        lista.stream() // stream para percorrer a lista
            .map(Pessoa::getNacionalidade) // map para pegar a nacionalidade
            .distinct() // distinct para pegar somente os valores únicos
            .forEach(System.out::println); // imprime os valores únicos de nacionalidade    
    }
}
