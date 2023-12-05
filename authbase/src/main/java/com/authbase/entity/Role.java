package com.authbase.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.UUID;

@Data
@Entity
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRole;

    private UUID uuid;

    @Column(unique = true)
    private String roleName;

    private String roleDescription;

}
