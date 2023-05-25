package com.hotelaria.service;

import com.hotelaria.dao.IDao;
import com.hotelaria.model.FilialHotel;

import java.sql.SQLException;
import java.util.List;

public class FilialService {
    private final IDao<FilialHotel> filialHotelIDao;

    public FilialService(IDao<FilialHotel> filialDao){
        this.filialHotelIDao = filialDao;
    }

    public FilialHotel salvarFilial(FilialHotel filialHotel) throws SQLException {
        return filialHotelIDao.salvar(filialHotel);
    }

    public FilialHotel buscarFilial(int id) throws SQLException {
        return filialHotelIDao.buscarFilial(id);
    }
}
