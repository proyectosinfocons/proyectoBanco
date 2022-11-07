package com.proyecto.demo.repository;

import com.proyecto.demo.dto.BodyMontoDTO;
import com.proyecto.demo.dto.RequestMontoDTO;
import com.proyecto.demo.model.tipodeCambio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



public interface RequestRepository  extends JpaRepository<RequestMontoDTO,Integer>{
}
