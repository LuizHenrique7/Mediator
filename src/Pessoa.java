public class Pessoa {

    public String elogiarFeedbackCliente(String mensagem) {
        return SAC.getInstancia().receberElogioDepartamentoVendas(mensagem);
    }

    public String reclamarFeedbackCliente(String mensagem) {
        return SAC.getInstancia().receberReclamacaoDepartamentoVendas(mensagem);
    }

    public String sugerirFeedbackCliente(String mensagem) {
        return SAC.getInstancia().receberSugestaoDepartamentoVendas(mensagem);
    }


}
