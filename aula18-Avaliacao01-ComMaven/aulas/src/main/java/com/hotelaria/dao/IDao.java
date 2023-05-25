package com.hotelaria.dao;

import com.hotelaria.model.FilialHotel;

import java.sql.SQLException;
import java.util.List;

public interface IDao <T>{
    T salvar(T t) throws SQLException;

    List<FilialHotel> mostrar() throws SQLException;

    FilialHotel buscarFilial(int id) throws SQLException;
}
