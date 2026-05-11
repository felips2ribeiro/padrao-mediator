package padroescomportamentais.mediator;

public class SAC {

    private static SAC instancia = new SAC();

    private SAC() {}

    public static SAC getInstancia() {
        return instancia;
    }

    public String receberElogioSuporte(String mensagem) {
        return "O SAC agradece seu contato.\n"+
                "O Suporte respondeu sua demanda: " + Suporte.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoSuporte(String mensagem) {
        return "O SAC agradece seu contato.\n"+
                "O Suporte respondeu sua demanda: " + Suporte.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoSuporte(String mensagem) {
        return "O SAC agradece seu contato.\n"+
                "O Suporte respondeu sua demanda: " + Suporte.getInstancia().receberSugestao(mensagem);
    }

    public String receberElogioFinanceiro(String mensagem) {
        return "O SAC agradece seu contato.\n"+
                "O Financeiro respondeu sua demanda: " + Financeiro.getInstancia().receberElogio(mensagem);
    }

    public String receberReclamacaoFinanceiro(String mensagem) {
        return "O SAC agradece seu contato.\n"+
                "O Financeiro respondeu sua demanda: " + Financeiro.getInstancia().receberReclamacao(mensagem);
    }

    public String receberSugestaoFinanceiro(String mensagem) {
        return "O SAC agradece seu contato.\n"+
                "O Financeiro respondeu sua demanda: " + Financeiro.getInstancia().receberSugestao(mensagem);
    }
}
