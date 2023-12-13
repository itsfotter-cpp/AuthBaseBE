package com.authbase.mapper;

import com.authbase.dto.request.DemandRequest;
import com.authbase.dto.response.DemandResponse;
import com.authbase.entity.Demand;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DemandMapper {

    @Mapping(source = "demandRequest.typeDemand", target = "typeDemand.idType")
    @Mapping(source = "demandRequest.userName", target = "user.userName")
    Demand fromDtoRequest(DemandRequest demandRequest);

    @Mapping(source = "demand.stateDemand.stateDescription", target = "stateDemand")
    @Mapping(source = "demand.typeDemand.typeDescription", target = "typeDemand")
    DemandResponse toDtoResponse(Demand demand);

    List<DemandResponse> toDtoResponseList(List<Demand> demand);

}
