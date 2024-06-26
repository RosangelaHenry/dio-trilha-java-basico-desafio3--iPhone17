package aparelho;

//** Classe para testar as saidas.**//

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        AparelhoMultiuso aparelho = new AparelhoMultiuso();

        System.out.println("-------------->");
        aparelho.selecionarMusica("Crazy Frog Remix");
        aparelho.tocar();
        aparelho.pausar();

        System.out.println("-------------->");
        aparelho.atender();
        aparelho.iniciarCorreioVoz();
        aparelho.ligar(30671820);

        System.out.println("-------------->");
        aparelho.exibirPagina();
        aparelho.atualizarPagina();
        aparelho.adicionarNovaAba();

        System.out.println("-------------->");
    }
}