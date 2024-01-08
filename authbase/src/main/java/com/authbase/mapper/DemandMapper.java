package com.authbase.mapper;

import com.authbase.dto.request.DemandRequest;
import com.authbase.dto.response.DemandResponse;
import com.authbase.entity.Demand;
import com.authbase.entity.User;
import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

import java.util.List;

@Mapper(componentModel = "spring")
public interface DemandMapper {

    @Mapping(source = "demandRequest.typeDemand", target = "typeDemand.idType")
    @Mapping(source = "demandRequest.userName", target = "user.userName")
    Demand fromDtoRequest(DemandRequest demandRequest);

    @Mapping(source = "demand.stateDemand.stateDescription", target = "stateDemand")
    @Mapping(source = "demand.typeDemand.typeDescription", target = "typeDemand")
    @Mapping(target = "user", ignore = true)
    DemandResponse toDtoResponse(Demand demand);

    List<DemandResponse> toDtoResponseList(List<Demand> demand);

    @AfterMapping
    default void setUserDemand(@MappingTarget DemandResponse demandResponse, Demand demand) {
        User user = demand.getUser();
        demandResponse.setUser(user.getUserFirstName() + " " + user.getUserLastName());
    }

}
