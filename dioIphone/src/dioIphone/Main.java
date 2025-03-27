package dioIphone;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        
        meuIphone.selecionarMusica("Imagine - John Lennon");
        meuIphone.tocar();
        meuIphone.pausar();
        
        meuIphone.ligar("+55 11 99999-9999");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
        
        meuIphone.exibirPagina("https://www.apple.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}