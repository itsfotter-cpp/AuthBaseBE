package com.authbase.dto;

import lombok.Data;

import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Data
public class StateDemandDto {

    @Id
    private Long idState;

    @NotNull
    private String stateDescription;

}
