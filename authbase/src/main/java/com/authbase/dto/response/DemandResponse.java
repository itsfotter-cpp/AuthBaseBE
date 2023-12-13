package com.authbase.dto.response;

import lombok.Data;

import java.time.LocalTime;
import java.util.Date;

@Data
public class DemandResponse {

    private Date dateDemand;

    private String stateDemand;

    private String typeDemand;

    private Date absenceDateStart;

    private Date absenceDateEnd;

    private LocalTime absenceTimeStart;

    private LocalTime absenceTimeEnd;

    private String note;

}
