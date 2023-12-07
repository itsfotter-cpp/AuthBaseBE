package com.authbase.dao;

import com.authbase.entity.Demand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemandDao extends JpaRepository<Demand, Long> {
}
