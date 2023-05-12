public class SAC {

    private static SAC instancia = new SAC();

    private SAC() {}

    public static SAC getInstancia() {
        return instancia;
    }

    public String receberElogioDepartamentoVendas(String mensagem) {
        return "O SAC agradece seu contato.\n"+
                "A Área de Feedback do Cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + FeedbackCliente.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoDepartamentoVendas(String mensagem) {
        return "O SAC agradece seu contato.\n"+
                "A Área de Feedback do Cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + FeedbackCliente.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoDepartamentoVendas(String mensagem) {
        return "O SAC agradece seu contato.\n"+
                "A Área de Feedback do Cliente respondeu sua demanda conforme mensagem a seguir.\n" +
                ">>" + FeedbackCliente.getInstancia().receberSugestao(mensagem);
    }

}
