package com.authbase.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalTime;
import java.util.Date;

@Data
@Entity
public class Demand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDemand;

    private Date dateDemand;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_state", referencedColumnName = "idState")
    private StateDemand stateDemand;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_type", referencedColumnName = "idType")
    private TypeDemand typeDemand;

    private Date absenceDateStart;

    private Date absenceDateEnd;

    private LocalTime absenceTimeStart;

    private LocalTime absenceTimeEnd;

    private String note;


}
