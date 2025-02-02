package com.devconmx.nutrilud_backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devconmx.nutrilud_backend.model.Tdatos_consultasVO;

@Repository
public interface Tdatos_consultasRepository extends JpaRepository<Tdatos_consultasVO, Integer> {
    List<Tdatos_consultasVO> findByNutriologoVO(int id);

    List<Tdatos_consultasVO> findByPacienteVO(int id);
}
