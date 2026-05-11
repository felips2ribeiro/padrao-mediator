package padroescomportamentais.mediator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarSuporte() {
        Cliente cliente = new Cliente();
        String expected = "O SAC agradece seu contato.\n" +
                "O Suporte respondeu sua demanda: O Suporte agradece o feedback positivo: Ótimo atendimento";
        assertEquals(expected, cliente.elogiarSuporte("Ótimo atendimento"));
    }

    @Test
    void deveReclamarFinanceiro() {
        Cliente cliente = new Cliente();
        String expected = "O SAC agradece seu contato.\n" +
                "O Financeiro respondeu sua demanda: O Financeiro vai analisar o erro no faturamento: Cobrança duplicada";
        assertEquals(expected, cliente.reclamarFinanceiro("Cobrança duplicada"));
    }

    @Test
    void deveSugerirSuporte() {
        Cliente cliente = new Cliente();
        String expected = "O SAC agradece seu contato.\n" +
                "O Suporte respondeu sua demanda: O Suporte vai avaliar a melhoria: App em modo escuro";
        assertEquals(expected, cliente.sugerirSuporte("App em modo escuro"));
    }
}
