package com.proyecto.demo.dto;

import lombok.*;

@Getter
@Setter

@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {
    private Integer id;
    private String username;
}