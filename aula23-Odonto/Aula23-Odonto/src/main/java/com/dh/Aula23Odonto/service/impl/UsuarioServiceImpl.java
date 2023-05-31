package com.dh.Aula23Odonto.service.impl;

import com.dh.Aula23Odonto.service.IUsuarioService;
import model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class UsuarioServiceImpl implements IUsuarioService<Usuario> {
    public static Map<Integer, Usuario> usuarioMap = new HashMap<>();

    @Override
    public Usuario salvar(Usuario usuario) {
        usuarioMap.put(usuario.getId(), usuario);
        return usuario;
    }

    @Override
    public List<Usuario> buscarTodos() {
        return new ArrayList<>(usuarioMap.values());
    }

    @Override
    public String excluir(Integer id) {
        usuarioMap.remove(id);
        return "Usuario Removido!";
    }
}
