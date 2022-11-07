package com.proyecto.demo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.*;


@Getter
@Setter
@Entity
@Table(name = "tb_request")
public class RequestMontoDTO {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@ApiModelProperty(notes = "El id de tipo de cambio")
	private Integer codigo;

	@ApiModelProperty(notes = "El monto actual")
	  private Double monto;
	
	@ApiModelProperty(notes = "La moneda origen")
	  private String monedadeOrigen;

	@ApiModelProperty(notes = "La moneda destino")
	  private String monedadeDestino;


	@ApiModelProperty(notes = "usuario")
	private String usuario;

}
