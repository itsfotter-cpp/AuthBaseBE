package com.authbase.service;

import com.authbase.dto.TypeDemandDto;
import com.authbase.dto.request.DemandRequest;
import com.authbase.dto.response.DemandResponse;

import java.util.List;

public interface IDemandService {

    List<TypeDemandDto> getTypeDemand();
    boolean insertNewDemandRequest(DemandRequest demandRequest);
    List<DemandResponse> manageDemands(String userName);

}
