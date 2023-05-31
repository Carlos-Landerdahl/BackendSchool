package com.dh.Aula23Odonto.service;

import java.util.List;

public interface IDentistaService <T>{
    T salvar(T t);

    List<T> buscarTodos();

    String excluir(Integer id);
}
