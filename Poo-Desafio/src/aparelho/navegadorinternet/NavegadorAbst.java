package aparelho.navegadorinternet;

public abstract class NavegadorAbst implements NavegadorIntf {

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo a pagina.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando pagina.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina.");
    }
}

