package com.authbase.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class TypeDemand {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idType;

    @Column(unique = true, nullable = false)
    private String typeDescription;

}
