import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {

    @Test
    void deveElogiarFeedbackCliente() {
        Cliente cliente = new Cliente();
        assertEquals("O SAC agradece seu contato.\nA Área de Feedback do Cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Área de Feedback do Cliente agradece a mensagem: Ótimo atendimento",
                cliente.elogiarFeedbackCliente("Ótimo atendimento"));
    }

    @Test
    void deveReclamarFeedbackCliente() {
        Cliente cliente = new Cliente();
        assertEquals("O SAC agradece seu contato.\nA Área de Feedback do Cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Área de Feedback do Cliente vai procurar melhorar o serviço da reclamação: Lentidão no atendimento",
                cliente.reclamarFeedbackCliente("Lentidão no atendimento"));
    }

    @Test
    void deveSugerirFeedbackCliente() {
        Cliente cliente = new Cliente();
        assertEquals("O SAC agradece seu contato.\nA Área de Feedback do Cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                        ">>A Área de Feedback do Cliente vai analisar a sugestão: Ampliar horário funcionamento",
                cliente.sugerirFeedbackCliente("Ampliar horário funcionamento"));
    }

}