package trilha_java_basico.desafios.poo;

public class Iphone implements ReprodutorMusical,NavegadorInternet,AparelhoTelefonico{
    //Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando Musica");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando Musica");
    }

    @Override
    public void selecionarMusica(String musica) {
       musica = "Musica selecionada";
       System.out.println(musica);
    }

    //Navegador de Internet
    @Override
    public void exibirPagina(String url) {
        url = "Exibindo pagina Web";
        System.out.println(url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicinar nova aba web");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizar pagina");
    }
    
    //Aparelho Telefonico

    @Override
    public void ligar(String numero) {
        numero = "Discando Numero";
        System.out.println(numero);
    }

    @Override
    public void atender() {
       System.out.println("Atendendo Ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de Voz");
    }
    
    
}
