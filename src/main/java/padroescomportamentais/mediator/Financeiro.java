package padroescomportamentais.mediator;

public class Financeiro implements Setor {

    private static Financeiro instancia = new Financeiro();

    private Financeiro() {}

    public static Financeiro getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O Financeiro vai analisar o erro no faturamento: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O Financeiro agradece o reconhecimento: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O Financeiro vai estudar a nova forma de pagamento: " + mensagem;
    }
}
