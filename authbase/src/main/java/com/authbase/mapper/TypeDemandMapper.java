package com.authbase.mapper;

import com.authbase.dto.TypeDemandDto;
import com.authbase.entity.TypeDemand;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TypeDemandMapper {

    List<TypeDemandDto> toDtoList(List<TypeDemand> typeDemandList);

}
