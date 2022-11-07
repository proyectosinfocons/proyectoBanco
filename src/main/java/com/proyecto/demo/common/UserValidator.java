package com.proyecto.demo.common;


import com.proyecto.demo.exception.IncorrectOrderRequestException;
import com.proyecto.demo.dto.User;

public class UserValidator {
    public static void validate(User user){
        if(user.getUsername()==null || user.getUsername().trim().isEmpty()){
            throw new IncorrectOrderRequestException("El nombre de usuario es requerido");
        }

        if(user.getUsername().length()>30){
            throw new IncorrectOrderRequestException("El nombre de usuario es muy largo (max 30)");
        }

        if(user.getPassword()==null || user.getPassword().isEmpty()){
            throw new IncorrectOrderRequestException("El password es requerido");
        }
        if(user.getPassword().length()>30){
            throw new IncorrectOrderRequestException("El password de usuario es muy largo (max 30)");
        }
    }
}