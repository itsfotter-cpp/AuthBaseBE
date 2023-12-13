package com.authbase.mapper;

import com.authbase.dto.TypeDemandDto;
import com.authbase.entity.TypeDemand;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-12T15:06:57+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11 (Oracle Corporation)"
)
@Component
public class TypeDemandMapperImpl implements TypeDemandMapper {

    @Override
    public List<TypeDemandDto> toDtoList(List<TypeDemand> typeDemandList) {
        if ( typeDemandList == null ) {
            return null;
        }

        List<TypeDemandDto> list = new ArrayList<TypeDemandDto>( typeDemandList.size() );
        for ( TypeDemand typeDemand : typeDemandList ) {
            list.add( typeDemandToTypeDemandDto( typeDemand ) );
        }

        return list;
    }

    protected TypeDemandDto typeDemandToTypeDemandDto(TypeDemand typeDemand) {
        if ( typeDemand == null ) {
            return null;
        }

        TypeDemandDto typeDemandDto = new TypeDemandDto();

        typeDemandDto.setIdType( typeDemand.getIdType() );
        typeDemandDto.setTypeDescription( typeDemand.getTypeDescription() );

        return typeDemandDto;
    }
}
