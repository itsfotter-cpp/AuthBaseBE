package com.authbase.mapper;

import com.authbase.dto.response.TypeDemandResponse;
import com.authbase.entity.TypeDemand;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TypeDemandMapper {

    List<TypeDemandResponse> toDtoList(List<TypeDemand> typeDemandList);

}
