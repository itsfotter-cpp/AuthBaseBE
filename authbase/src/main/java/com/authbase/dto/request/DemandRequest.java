package com.authbase.dto.request;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.time.LocalTime;
import java.util.Date;

@Data
public class DemandRequest {

    private Date dateDemand;

    @NotNull
    private Long typeDemand;

    private String userName;

    @NotNull
    private Date absenceDateStart;

    private Date absenceDateEnd;

    private LocalTime absenceTimeStart;

    private LocalTime absenceTimeEnd;

    private String note;

}
