package com.proyecto.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Charsets;
import com.google.common.io.Resources;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proyecto.demo.configuration.variablesRegistros;
import com.proyecto.demo.model.tipodeCambio;
import com.proyecto.demo.repository.CambioRepository;


@SpringBootApplication
public class ProyectoBancoApplication
        implements CommandLineRunner {
    @Autowired
    CambioRepository cambiodetiporepository;

    @Autowired
    variablesRegistros registrosmock;
    public static void main(String[] args) {
        SpringApplication.run(ProyectoBancoApplication.class, args);
    }



    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub

        cambiodetiporepository.saveAll(cambiosdetiposrec());
    }

    @SuppressWarnings("unused")
    private List<tipodeCambio> cambiosdetiposrec() throws JsonProcessingException {
        ObjectMapper ejmmapper = new ObjectMapper();
        String json = rutadeconversion(registrosmock.getTipodecambio());

        return ejmmapper.readValue(json, new TypeReference<List<tipodeCambio>>() {
        });
    }



    private String rutadeconversion(String resource) {
        URL isyeyu = ProyectoBancoApplication.class.getClassLoader().getResource(resource);
        try {
            String ruta = Resources.toString(isyeyu, Charsets.UTF_8);
            return ruta;
        } catch (IOException io) {
            io.printStackTrace();
        }
        return null;
    }
}
