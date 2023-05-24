package service;

import dao.IDao;
import model.Paciente;

import java.sql.SQLException;

public class PacienteService {
    private IDao<Paciente> pacienteIDao;

    public PacienteService(IDao<Paciente> pacienteIDao) {
        this.pacienteIDao = pacienteIDao;
    }

    public Paciente salvarPaciente(Paciente paciente) throws SQLException {
        return pacienteIDao.salvar(paciente);
    }

    public Paciente excluirPaciente(int id) throws SQLException {
        return pacienteIDao.excluir(id);
    }
}
