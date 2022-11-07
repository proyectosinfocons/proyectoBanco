package com.proyecto.demo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.Table;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseMontoDTO {
	
	@ApiModelProperty(notes = "El monto actual")
	  private Double monto;
	
	@ApiModelProperty(notes = "El monto total cambiado")
	  private Double montototaltipoCambio;

	@ApiModelProperty(notes = "La moneda de origen")
	  private String monedadeOrigen;

	  @ApiModelProperty(notes = "La moneda Destino")
	  private String monedadeDestino;

	  @ApiModelProperty(notes = "El tipo de cambio")
	  private Double tipodecambio;
}
