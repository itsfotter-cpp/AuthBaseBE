package com.authbase.mapper;

import com.authbase.dto.response.TypeDemandResponse;
import com.authbase.entity.TypeDemand;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-12-07T15:40:49+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 11 (Oracle Corporation)"
)
@Component
public class TypeDemandMapperImpl implements TypeDemandMapper {

    @Override
    public List<TypeDemandResponse> toDtoList(List<TypeDemand> typeDemandList) {
        if ( typeDemandList == null ) {
            return null;
        }

        List<TypeDemandResponse> list = new ArrayList<TypeDemandResponse>( typeDemandList.size() );
        for ( TypeDemand typeDemand : typeDemandList ) {
            list.add( typeDemandToTypeDemandResponse( typeDemand ) );
        }

        return list;
    }

    protected TypeDemandResponse typeDemandToTypeDemandResponse(TypeDemand typeDemand) {
        if ( typeDemand == null ) {
            return null;
        }

        TypeDemandResponse typeDemandResponse = new TypeDemandResponse();

        typeDemandResponse.setIdType( typeDemand.getIdType() );
        typeDemandResponse.setTypeDescription( typeDemand.getTypeDescription() );

        return typeDemandResponse;
    }
}
