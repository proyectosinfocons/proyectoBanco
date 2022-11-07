package com.proyecto.demo.service;

import com.proyecto.demo.dto.RequestMontoDTO;
import com.proyecto.demo.dto.ResponseMontoDTO;
import com.proyecto.demo.model.tipodeCambio;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;

public interface cambioService {

	  Single<ResponseMontoDTO> listatipodecambio(RequestMontoDTO requestmontocambioDTO);

	  Observable<tipodeCambio> findAll();

	  Single<tipodeCambio> update(tipodeCambio tipodecambiomonto);

	  Maybe<tipodeCambio> findById(Integer id);

	Single<tipodeCambio> save(tipodeCambio tipodecambiomonto);

	Single<RequestMontoDTO> saverequest(RequestMontoDTO tipodecambiomonto);

	public Observable<RequestMontoDTO> findAllrequest();

}
