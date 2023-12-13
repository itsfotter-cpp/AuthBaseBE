package com.authbase.dao;

import com.authbase.entity.Demand;
import com.authbase.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DemandDao extends JpaRepository<Demand, Long> {

    List<Demand> findByUser(User user);

}
