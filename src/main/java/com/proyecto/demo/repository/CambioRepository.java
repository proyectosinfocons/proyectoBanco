package com.proyecto.demo.repository;

import com.proyecto.demo.model.tipodeCambio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CambioRepository extends JpaRepository<tipodeCambio,Integer>{



	  tipodeCambio findByMonedadeOrigenAndMonedadeDestino(String monedaOrigen, String monedaDestino);
}
