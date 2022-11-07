package com.proyecto.demo.configuration;

import com.proyecto.demo.security.UserPrincipal;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Data
public class variablesRegistros {

	  @Value("${prue.total-cambio}")
	  private String tipodecambio;

	@Bean
	public ModelMapper modelMapper() {
		ModelMapper modelMapper = new ModelMapper();
		return modelMapper;
	}

	@Bean
	public UserPrincipal modelPrincipal() {
		UserPrincipal modelMapper = new UserPrincipal();
		return modelMapper;
	}
}
