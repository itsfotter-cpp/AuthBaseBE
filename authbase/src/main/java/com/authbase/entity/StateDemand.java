package com.authbase.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class StateDemand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idState;

    @Column(unique = true, nullable = false)
    private String stateDescription;

}
