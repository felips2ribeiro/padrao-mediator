package padroescomportamentais.mediator;

public class Suporte implements Setor {

    private static Suporte instancia = new Suporte();

    private Suporte() {}

    public static Suporte getInstancia() {
        return instancia;
    }

    public String receberReclamacao(String mensagem) {
        return "O Suporte vai resolver o problema técnico: " + mensagem;
    }

    public String receberElogio(String mensagem) {
        return "O Suporte agradece o feedback positivo: " + mensagem;
    }

    public String receberSugestao(String mensagem) {
        return "O Suporte vai avaliar a melhoria: " + mensagem;
    }
}
