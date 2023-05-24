import config.ConfiguracaoJDBC;
import dao.impl.PacienteDao;
import model.Endereco;
import model.Paciente;
import service.PacienteService;

import java.sql.SQLException;

public class Main {
    public static PacienteService pacienteService = new PacienteService(new PacienteDao(new ConfiguracaoJDBC()));
    public static void main(String[] args) throws SQLException {

        Endereco e1 = new Endereco("Rua do marceneiro", "360", "Uberlandia", "Planalto");
        Paciente p1 = new Paciente(
                "Carlos",
                "Roberto",
                "12312mg123",
                "23/05/2023",
                e1
        );

        pacienteService.salvarPaciente(p1);
        pacienteService.excluirPaciente(p1.getId());
    }
}