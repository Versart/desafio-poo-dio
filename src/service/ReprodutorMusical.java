package service;
import model.Musica;

public class ReprodutorMusical {
    
    private Musica musica;
    
    public ReprodutorMusical() {

    }
    
    public ReprodutorMusical(Musica musica) {
        this.musica = musica;
    }

    public void tocarMusica() {
        if(musica != null) {
            System.out.printf("Tocando\n%s", musica.informacoesMusica());
        }
        else{
            System.out.println("Selecione uma música!");
        }
        
    }

    public void pausarMusica() {
        System.out.printf("Pausando\n%s", musica.informacoesMusica());
    }

    public void selecionarMusica(Musica musica) {
        this.musica = musica;
    }

}
