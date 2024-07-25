public class ClasseLimit {
 public static void main(String[] args) {
        Pessoa.listaDePessoas().stream() // stream para percorrer a lista
            .limit(3) // limit para pegar somente os 3 primeiros elementos
             // imprime os 3 primeiros nomes da lista e nacionalidade
            .forEach(pessoa -> System.out.println(pessoa.getNome() + " - " + pessoa.getNacionalidade())); 
 }
}
