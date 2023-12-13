package com.authbase.dao;

import com.authbase.entity.StateDemand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StateDemandDao extends JpaRepository<StateDemand, Long> {

    Optional<StateDemand> findByStateDescription(String descr);

}
