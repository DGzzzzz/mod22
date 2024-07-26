package Teste_Part1;

import Tarefa_Streams.Pessoas;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;
import java.util.stream.Collectors;

public class TestFiltroMulheres {
    @Test
    public void testFiltroFeminino() {
        List<Pessoas> todasAsPessoas = Pessoas.listaDePessoas();
        List<Pessoas> filtroFeminino = todasAsPessoas.stream()
            .filter(pessoas -> pessoas.getSexo().equals("Feminino"))
            .collect(Collectors.toList());

        // Verifica se todas as pessoas na lista filtrada são do sexo feminino
        assertTrue(filtroFeminino.stream().allMatch(pessoas -> pessoas.getSexo().equals("Feminino")));
    }
}
