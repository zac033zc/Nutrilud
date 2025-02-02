package com.devconmx.nutrilud_backend.service;

import java.util.List;

import com.devconmx.nutrilud_backend.model.TarticulosDTO;
import com.devconmx.nutrilud_backend.model.TarticulosVO;
import com.devconmx.nutrilud_backend.utils.exception.AppException;

public interface TarticulosServices {
    void save(TarticulosDTO tarticulosDTO) throws AppException;

    List<TarticulosVO> findAll() throws AppException;

    List<TarticulosVO> findById(int id) throws AppException;
}
