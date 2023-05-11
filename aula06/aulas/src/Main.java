import model.Cliente;
import model.Filme;
import services.GradeFilmesProxy;

public class Main {
    public static void main(String[] args){
        GradeFilmesProxy proxy = new GradeFilmesProxy();
        
        Filme f1 = new Filme("Longe de casa", 49);
        Filme f2 = new Filme("Batman", 130);
        Filme f3 = new Filme("Barbie", 51);

        Cliente p1 = new Cliente("Carlos", 49, "Longe de casa");
        Cliente p2 = new Cliente("Roberto", 9, "Batman");
        Cliente p3 = new Cliente("Neto", 999, "Barbie");

        proxy.getFilme(f1.getNomeFilme(), p1.getIpUser(), f1.getIpFilme(), f1.getNomeFilme());
        proxy.getFilme(f2.getNomeFilme(), p2.getIpUser(), f2.getIpFilme(), f2.getNomeFilme());
        proxy.getFilme(f3.getNomeFilme(), p3.getIpUser(), f3.getIpFilme(), f3.getNomeFilme());
    }
}