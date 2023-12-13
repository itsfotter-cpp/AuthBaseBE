package com.authbase.dto;

import lombok.Data;

import javax.persistence.Id;

@Data
public class TypeDemandDto {

    @Id
    private Long idType;

    private String typeDescription;

}
