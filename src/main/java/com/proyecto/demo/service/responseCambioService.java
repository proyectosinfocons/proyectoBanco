package com.proyecto.demo.service;

import com.proyecto.demo.dto.RequestMontoDTO;
import com.proyecto.demo.dto.ResponseMontoDTO;
import io.reactivex.Single;

public interface responseCambioService {

	
	
	  Single<ResponseMontoDTO> responsemonto(RequestMontoDTO requestmonto, Double montototal,
		      Double tipomontototalcambio);
}
