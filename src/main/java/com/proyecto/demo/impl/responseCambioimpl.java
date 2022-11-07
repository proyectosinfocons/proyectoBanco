package com.proyecto.demo.impl;

import com.proyecto.demo.dto.RequestMontoDTO;
import com.proyecto.demo.dto.ResponseMontoDTO;
import com.proyecto.demo.service.responseCambioService;
import io.reactivex.Single;
import org.springframework.stereotype.Component;


@Component
public class responseCambioimpl implements responseCambioService{

	@Override
	public Single<ResponseMontoDTO> responsemonto(RequestMontoDTO requestmonto, Double montototal,
			Double tipomontototalcambio) {
		// TODO Auto-generated method stub
		   return Single.just(ResponseMontoDTO.builder()
			        .monto(requestmonto.getMonto())
			        .montototaltipoCambio(montototal)
			        .monedadeOrigen(requestmonto.getMonedadeOrigen())
			        .monedadeDestino(requestmonto.getMonedadeDestino())
			        .tipodecambio(tipomontototalcambio)
			        .build());
	}

}
