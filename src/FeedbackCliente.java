public class FeedbackCliente implements Setor {

    private static FeedbackCliente instancia = new FeedbackCliente();

    private FeedbackCliente() {}

    public static FeedbackCliente getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "A Área de Feedback do Cliente vai procurar melhorar o serviço da reclamação: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "A Área de Feedback do Cliente agradece a mensagem: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "A Área de Feedback do Cliente vai analisar a sugestão: " + mensagem;
    }
}
