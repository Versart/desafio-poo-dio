import controller.Iphone;
import model.Musica;

public class App {
    public static void main(String[] args) {
        
        Iphone iphone = new Iphone();

        iphone.getAparelhoEletronico().atender();

        iphone.getNavegadorInternet().exibirPagina("google.com");

        iphone.getReprodutorMusical().selecionarMusica(new Musica("Musica 1", "Artista 1"));
    }
}
