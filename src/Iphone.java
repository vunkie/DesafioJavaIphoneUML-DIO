public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    
    @Override
    public void play() {
        System.out.println("Reproduzindo música...");
    }

    @Override
    public void pause() {
        System.out.println("Música pausada.");
    }

    @Override
    public void stop() {
        System.out.println("Música parada.");
    }

    
    @Override
    public void ligar() {
        System.out.println("Ligando...");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}