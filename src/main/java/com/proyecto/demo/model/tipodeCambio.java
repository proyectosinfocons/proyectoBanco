package com.proyecto.demo.model;

import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "tb_tipocambio")
public class tipodeCambio {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @ApiModelProperty(notes = "El id de tipo de cambio")
	  private Integer codigo;
	 
	 @ApiModelProperty(notes = "Moneda actual")
	  private String monedadeOrigen;

	 @ApiModelProperty(notes = "Moneda destino")
	  private String monedadeDestino;

	 
	 @ApiModelProperty(notes = "valor de tipo de cambio")
	  private Double tipocambiovalor;
	
}
