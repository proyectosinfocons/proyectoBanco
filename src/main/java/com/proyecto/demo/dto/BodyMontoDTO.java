package com.proyecto.demo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BodyMontoDTO {
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


}
