package trilha_java_basico.desafios.poo;

public class Celular {
    
    public static void main(String[] args) {
        Iphone iphone = new Iphone();
        
        //Reprodutor Musical
        System.out.println("Reprodutor Musical");
        iphone.tocar();
        iphone.selecionarMusica("");
        iphone.pausar();
        System.out.println("Navador de Internet");
        //Navador de Internet
        iphone.exibirPagina("");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        System.out.println("Aparelho Telefonico");
        //Aparelho Telefonico
        iphone.ligar("");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        
        
    }
    
}
