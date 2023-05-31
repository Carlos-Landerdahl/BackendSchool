package com.dh.Aula23Odonto.service.impl;

import com.dh.Aula23Odonto.service.IDentistaService;
import model.Dentista;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class DentistaServiceImpl implements IDentistaService<Dentista> {

    public static Map<Integer, Dentista> dentistaMap = new HashMap<>();

    @Override
    public Dentista salvar(Dentista dentista) {
        dentistaMap.put(dentista.getId(), dentista);
        return dentista;
    }

    @Override
    public List<Dentista> buscarTodos() {
        return new ArrayList<>(dentistaMap.values());
    }

    @Override
    public String excluir(Integer id) {
        dentistaMap.remove(id);
        return "Dentista removido do banco de dados!";
    }
}
