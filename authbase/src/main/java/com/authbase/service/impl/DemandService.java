package com.authbase.service.impl;

import com.authbase.dao.DemandDao;
import com.authbase.dao.StateDemandDao;
import com.authbase.dao.TypeDao;
import com.authbase.dao.UserDao;
import com.authbase.dto.TypeDemandDto;
import com.authbase.dto.request.DemandRequest;
import com.authbase.dto.response.DemandResponse;
import com.authbase.entity.Demand;
import com.authbase.entity.StateDemand;
import com.authbase.entity.TypeDemand;
import com.authbase.entity.User;
import com.authbase.exception.ResourceNotFoundException;
import com.authbase.mapper.DemandMapper;
import com.authbase.mapper.TypeDemandMapper;
import com.authbase.service.IDemandService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class DemandService implements IDemandService {

    private final DemandDao demandDao;
    private final TypeDao typeDao;
    private final StateDemandDao stateDemandDao;
    private final UserDao userDao;

    private final DemandMapper demandMapper;
    private final TypeDemandMapper typeDemandMapper;

    @Override
    public List<TypeDemandDto> getTypeDemand() {
        return typeDemandMapper.toDtoList(typeDao.findAll());
    }

    @Override
    public boolean insertNewDemandRequest(DemandRequest demandRequest) {
        Demand demand = demandMapper.fromDtoRequest(demandRequest);
        demand.setDateDemand(new Date());

        User user = userDao.findByUserName(demandRequest.getUserName()).orElseThrow(
                () -> new ResourceNotFoundException("User not found")
        );
        demand.setUser(user);

        StateDemand stateDemand = stateDemandDao.findByStateDescription("PENDING").orElseThrow(
                () -> new ResourceNotFoundException("State not found")
        );
        demand.setStateDemand(stateDemand);

        TypeDemand typeDemand = typeDao.findById(demandRequest.getTypeDemand())
                .orElseThrow(() -> new ResourceNotFoundException("Type not found!"));
        demand.setTypeDemand(typeDemand);
        demandDao.save(demand);

        return true;
    }

    @Override
    public List<DemandResponse> manageDemands(String userName) {
        User user = userDao.findByUserName(userName).orElseThrow(
                () -> new ResourceNotFoundException("User not found")
        );

        List<Demand> demandList = demandDao.findByUser(user);

        return demandMapper.toDtoResponseList(demandList);
    }
}
