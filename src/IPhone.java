public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        System.out.println("Funcionalidades de ReprodutorMusical");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Imagine - John Lennon");

        System.out.println("Funcionalidades de AparelhoTelefonico");
        iphone.ligar("4002-8922");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        System.out.println("Funcionalidades de NavegadorInternet"); 
        iphone.exibirPagina("http://www.facebook.com");
        iphone.adicionarNovaAba("http://www.instagram.com");
        iphone.atualizarPagina();
    }

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música: " + musica);
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba com a URL: " + url);
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }


}
