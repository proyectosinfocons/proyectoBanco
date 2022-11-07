package com.proyecto.demo.impl;

import com.proyecto.demo.dto.RequestMontoDTO;
import com.proyecto.demo.dto.ResponseMontoDTO;
import com.proyecto.demo.model.tipodeCambio;
import com.proyecto.demo.repository.CambioRepository;
import com.proyecto.demo.repository.RequestRepository;
import com.proyecto.demo.service.cambioService;
import com.proyecto.demo.service.responseCambioService;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;


@AllArgsConstructor
@Service
public class cambioServiceImpl implements cambioService{

	
	
	
	private final CambioRepository repositorycambio;

	private final RequestRepository repositorrequestcambio;
	  private final responseCambioService montoService;

	@Override
	public Single<ResponseMontoDTO> listatipodecambio(RequestMontoDTO montocambioDTO) {
		tipodeCambio responsedemontotipo = repositorycambio.findByMonedadeOrigenAndMonedadeDestino(
				montocambioDTO.getMonedadeOrigen().toUpperCase(), montocambioDTO.getMonedadeDestino().toUpperCase());



		Double	 montotal = montocambioDTO.getMonto() * responsedemontotipo.getTipocambiovalor();



		return montoService.responsemonto(montocambioDTO, montotal, responsedemontotipo.getTipocambiovalor());
	}

	@Override
	public Observable<tipodeCambio> findAll() {
		// TODO Auto-generated method stub
		return Single.just(repositorycambio.findAll()).toObservable().flatMap(Observable::fromIterable);
	}

	@Override
	public Single<tipodeCambio> update(tipodeCambio tipodecambiomonto) {
		// TODO Auto-generated method stub
		return Single.just(repositorycambio.save(tipodecambiomonto));
	
	}

	@Override
	public Maybe<tipodeCambio> findById(Integer id) {
		// TODO Auto-generated method stub
	    Optional<tipodeCambio> cambiomonto = repositorycambio.findById(id);

	    if (cambiomonto.isPresent()) {
	      return Maybe.just(cambiomonto.get());
	    } else {
	      return Maybe.empty();
	    }
	}

	@Override
	public Single<tipodeCambio> save(tipodeCambio tipodecambiomonto) {
		return Single.just(repositorycambio.save(tipodecambiomonto));
	}

	@Override
	public Single<RequestMontoDTO> saverequest(RequestMontoDTO tipodecambiomonto) {
		return Single.just(repositorrequestcambio.save(tipodecambiomonto));
	}

	@Override
	public Observable<RequestMontoDTO> findAllrequest() {
		return Single.just(repositorrequestcambio.findAll()).toObservable().flatMap(Observable::fromIterable);
	}


}
