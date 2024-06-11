import service.AparelhoEletronico;
import service.NavegadorInternet;
import service.ReprodutorMusical;

public class Iphone {

    private AparelhoEletronico aparelhoEletronico = new AparelhoEletronico();

    private NavegadorInternet navegadorInternet = new NavegadorInternet();

    private ReprodutorMusical reprodutorMusical = new ReprodutorMusical();

    public Iphone() {
        System.out.println("Ligando o iphone");
    }
    public AparelhoEletronico getAparelhoEletronico() {
        return aparelhoEletronico;
    }

    public void setAparelhoEletronico(AparelhoEletronico aparelhoEletronico) {
        this.aparelhoEletronico = aparelhoEletronico;
    }

    public NavegadorInternet getNavegadorInternet() {
        return navegadorInternet;
    }

    public void setNavegadorInternet(NavegadorInternet navegadorInternet) {
        this.navegadorInternet = navegadorInternet;
    }

    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public void setReprodutorMusical(ReprodutorMusical reprodutorMusical) {
        this.reprodutorMusical = reprodutorMusical;
    }

    

}
