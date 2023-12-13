package com.authbase.mapper;

import com.authbase.dto.request.DemandRequest;
import com.authbase.dto.response.DemandResponse;
import com.authbase.entity.Demand;
import com.authbase.entity.StateDemand;
import com.authbase.entity.TypeDemand;
import com.authbase.entity.User;
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
public class DemandMapperImpl implements DemandMapper {

    @Override
    public Demand fromDtoRequest(DemandRequest demandRequest) {
        if ( demandRequest == null ) {
            return null;
        }

        Demand demand = new Demand();

        demand.setTypeDemand( demandRequestToTypeDemand( demandRequest ) );
        demand.setUser( demandRequestToUser( demandRequest ) );
        demand.setDateDemand( demandRequest.getDateDemand() );
        demand.setAbsenceDateStart( demandRequest.getAbsenceDateStart() );
        demand.setAbsenceDateEnd( demandRequest.getAbsenceDateEnd() );
        demand.setAbsenceTimeStart( demandRequest.getAbsenceTimeStart() );
        demand.setAbsenceTimeEnd( demandRequest.getAbsenceTimeEnd() );
        demand.setNote( demandRequest.getNote() );

        return demand;
    }

    @Override
    public DemandResponse toDtoResponse(Demand demand) {
        if ( demand == null ) {
            return null;
        }

        DemandResponse demandResponse = new DemandResponse();

        demandResponse.setStateDemand( demandStateDemandStateDescription( demand ) );
        demandResponse.setTypeDemand( demandTypeDemandTypeDescription( demand ) );
        demandResponse.setDateDemand( demand.getDateDemand() );
        demandResponse.setAbsenceDateStart( demand.getAbsenceDateStart() );
        demandResponse.setAbsenceDateEnd( demand.getAbsenceDateEnd() );
        demandResponse.setAbsenceTimeStart( demand.getAbsenceTimeStart() );
        demandResponse.setAbsenceTimeEnd( demand.getAbsenceTimeEnd() );
        demandResponse.setNote( demand.getNote() );

        return demandResponse;
    }

    @Override
    public List<DemandResponse> toDtoResponseList(List<Demand> demand) {
        if ( demand == null ) {
            return null;
        }

        List<DemandResponse> list = new ArrayList<DemandResponse>( demand.size() );
        for ( Demand demand1 : demand ) {
            list.add( toDtoResponse( demand1 ) );
        }

        return list;
    }

    protected TypeDemand demandRequestToTypeDemand(DemandRequest demandRequest) {
        if ( demandRequest == null ) {
            return null;
        }

        TypeDemand typeDemand = new TypeDemand();

        typeDemand.setIdType( demandRequest.getTypeDemand() );

        return typeDemand;
    }

    protected User demandRequestToUser(DemandRequest demandRequest) {
        if ( demandRequest == null ) {
            return null;
        }

        User user = new User();

        user.setUserName( demandRequest.getUserName() );

        return user;
    }

    private String demandStateDemandStateDescription(Demand demand) {
        if ( demand == null ) {
            return null;
        }
        StateDemand stateDemand = demand.getStateDemand();
        if ( stateDemand == null ) {
            return null;
        }
        String stateDescription = stateDemand.getStateDescription();
        if ( stateDescription == null ) {
            return null;
        }
        return stateDescription;
    }

    private String demandTypeDemandTypeDescription(Demand demand) {
        if ( demand == null ) {
            return null;
        }
        TypeDemand typeDemand = demand.getTypeDemand();
        if ( typeDemand == null ) {
            return null;
        }
        String typeDescription = typeDemand.getTypeDescription();
        if ( typeDescription == null ) {
            return null;
        }
        return typeDescription;
    }
}
