package com.dh.aula22Spring.service.impl;

import com.dh.aula22Spring.model.Veiculo;
import com.dh.aula22Spring.service.VeiculoService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class VeiculoServiceImpl implements VeiculoService {
    @Override
    public List<Veiculo> listVeiculo() {
        return Arrays.asList(new Veiculo("Ferrari", "Vermelha"),
                new Veiculo("Chevrolet", "Cinza"),
                new Veiculo("Volkswagen", "Preto"),
                new Veiculo("AUDI", "Branco")
        );
    }
}
