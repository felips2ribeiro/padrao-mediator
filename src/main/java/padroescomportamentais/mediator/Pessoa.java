package padroescomportamentais.mediator;

public class Pessoa {

    public String elogiarSuporte(String mensagem) {
        return SAC.getInstancia().receberElogioSuporte(mensagem);
    }

    public String reclamarSuporte(String mensagem) {
        return SAC.getInstancia().receberReclamacaoSuporte(mensagem);
    }

    public String sugerirSuporte(String mensagem) {
        return SAC.getInstancia().receberSugestaoSuporte(mensagem);
    }

    public String elogiarFinanceiro(String mensagem) {
        return SAC.getInstancia().receberElogioFinanceiro(mensagem);
    }

    public String reclamarFinanceiro(String mensagem) {
        return SAC.getInstancia().receberReclamacaoFinanceiro(mensagem);
    }

    public String sugerirFinanceiro(String mensagem) {
        return SAC.getInstancia().receberSugestaoFinanceiro(mensagem);
    }
}
