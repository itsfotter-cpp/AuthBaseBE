package com.authbase.dao;

import com.authbase.entity.TypeDemand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TypeDao extends JpaRepository<TypeDemand, Long> {

    Optional<TypeDemand> findByTypeDescription(String descr);

}
