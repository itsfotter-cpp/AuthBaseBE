package com.authbase.dto.response;

import lombok.Data;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
public class TypeDemandResponse {

    @Id
    private Long idType;

    @NotNull
    private String typeDescription;

}
