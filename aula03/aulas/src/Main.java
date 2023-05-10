import model.Afiliado;
import model.Funcionarios;
public class Main {
    public static void main(String[] args) {

        Funcionarios funcionarios = new Funcionarios(3);
        funcionarios.calculateTime(funcionarios.getTempoEmpresa());
        funcionarios.obterAfiliado();
        funcionarios.obterAfiliado();
        funcionarios.sell();
        funcionarios.sell();

        System.out.println( funcionarios.showCategory(funcionarios.getPoints()) + " - "+ funcionarios.getPoints() + " pontos");

        Afiliado afiliado = new Afiliado();
        afiliado.sell();
        afiliado.sell();

        System.out.println( afiliado.showCategory(afiliado.getPoints()) + " - "+ afiliado.getPoints() + " pontos");
    }
}