package com.hotelaria.dao;

import java.sql.SQLException;
import java.util.List;

public interface IDao <T>{
    T salvar(T t) throws SQLException;
    List<T> mostrar() throws SQLException;
}
