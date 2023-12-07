package com.authbase.service;

import com.authbase.dao.DemandDao;
import com.authbase.dao.TypeDao;
import com.authbase.dto.response.TypeDemandResponse;
import com.authbase.mapper.TypeDemandMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class DemandService {

    private final DemandDao demandDao;
    private final TypeDao typeDao;
    private final TypeDemandMapper typeDemandMapper;

    public List<TypeDemandResponse> getTypeDemand() {
        return typeDemandMapper.toDtoList(typeDao.findAll());
    }

}
