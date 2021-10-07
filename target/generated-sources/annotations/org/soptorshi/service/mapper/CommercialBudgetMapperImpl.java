package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.CommercialBudget;
import org.soptorshi.service.dto.CommercialBudgetDTO;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class CommercialBudgetMapperImpl implements CommercialBudgetMapper {

    @Override
    public CommercialBudget toEntity(CommercialBudgetDTO dto) {
        if ( dto == null ) {
            return null;
        }

        CommercialBudget commercialBudget = new CommercialBudget();

        commercialBudget.setId( dto.getId() );
        commercialBudget.setBudgetNo( dto.getBudgetNo() );
        commercialBudget.setType( dto.getType() );
        commercialBudget.setCustomer( dto.getCustomer() );
        commercialBudget.setBudgetDate( dto.getBudgetDate() );
        commercialBudget.setCompanyName( dto.getCompanyName() );
        commercialBudget.setPaymentType( dto.getPaymentType() );
        commercialBudget.setTransportationType( dto.getTransportationType() );
        commercialBudget.setSeaPortName( dto.getSeaPortName() );
        commercialBudget.setSeaPortCost( dto.getSeaPortCost() );
        commercialBudget.setAirPortName( dto.getAirPortName() );
        commercialBudget.setAirPortCost( dto.getAirPortCost() );
        commercialBudget.setLandPortName( dto.getLandPortName() );
        commercialBudget.setLandPortCost( dto.getLandPortCost() );
        commercialBudget.setInsurancePrice( dto.getInsurancePrice() );
        commercialBudget.setTotalTransportationCost( dto.getTotalTransportationCost() );
        commercialBudget.setTotalQuantity( dto.getTotalQuantity() );
        commercialBudget.setTotalOfferedPrice( dto.getTotalOfferedPrice() );
        commercialBudget.setTotalBuyingPrice( dto.getTotalBuyingPrice() );
        commercialBudget.setProfitAmount( dto.getProfitAmount() );
        commercialBudget.setProfitPercentage( dto.getProfitPercentage() );
        commercialBudget.setBudgetStatus( dto.getBudgetStatus() );
        commercialBudget.setProformaNo( dto.getProformaNo() );
        commercialBudget.setCreatedBy( dto.getCreatedBy() );
        commercialBudget.setCreatedOn( dto.getCreatedOn() );
        commercialBudget.setUpdatedBy( dto.getUpdatedBy() );
        commercialBudget.setUpdatedOn( dto.getUpdatedOn() );

        return commercialBudget;
    }

    @Override
    public CommercialBudgetDTO toDto(CommercialBudget entity) {
        if ( entity == null ) {
            return null;
        }

        CommercialBudgetDTO commercialBudgetDTO = new CommercialBudgetDTO();

        commercialBudgetDTO.setId( entity.getId() );
        commercialBudgetDTO.setBudgetNo( entity.getBudgetNo() );
        commercialBudgetDTO.setType( entity.getType() );
        commercialBudgetDTO.setCustomer( entity.getCustomer() );
        commercialBudgetDTO.setBudgetDate( entity.getBudgetDate() );
        commercialBudgetDTO.setCompanyName( entity.getCompanyName() );
        commercialBudgetDTO.setPaymentType( entity.getPaymentType() );
        commercialBudgetDTO.setTransportationType( entity.getTransportationType() );
        commercialBudgetDTO.setSeaPortName( entity.getSeaPortName() );
        commercialBudgetDTO.setSeaPortCost( entity.getSeaPortCost() );
        commercialBudgetDTO.setAirPortName( entity.getAirPortName() );
        commercialBudgetDTO.setAirPortCost( entity.getAirPortCost() );
        commercialBudgetDTO.setLandPortName( entity.getLandPortName() );
        commercialBudgetDTO.setLandPortCost( entity.getLandPortCost() );
        commercialBudgetDTO.setInsurancePrice( entity.getInsurancePrice() );
        commercialBudgetDTO.setTotalTransportationCost( entity.getTotalTransportationCost() );
        commercialBudgetDTO.setTotalQuantity( entity.getTotalQuantity() );
        commercialBudgetDTO.setTotalOfferedPrice( entity.getTotalOfferedPrice() );
        commercialBudgetDTO.setTotalBuyingPrice( entity.getTotalBuyingPrice() );
        commercialBudgetDTO.setProfitAmount( entity.getProfitAmount() );
        commercialBudgetDTO.setProfitPercentage( entity.getProfitPercentage() );
        commercialBudgetDTO.setBudgetStatus( entity.getBudgetStatus() );
        commercialBudgetDTO.setProformaNo( entity.getProformaNo() );
        commercialBudgetDTO.setCreatedBy( entity.getCreatedBy() );
        commercialBudgetDTO.setCreatedOn( entity.getCreatedOn() );
        commercialBudgetDTO.setUpdatedBy( entity.getUpdatedBy() );
        commercialBudgetDTO.setUpdatedOn( entity.getUpdatedOn() );

        return commercialBudgetDTO;
    }

    @Override
    public List<CommercialBudget> toEntity(List<CommercialBudgetDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<CommercialBudget> list = new ArrayList<CommercialBudget>( dtoList.size() );
        for ( CommercialBudgetDTO commercialBudgetDTO : dtoList ) {
            list.add( toEntity( commercialBudgetDTO ) );
        }

        return list;
    }

    @Override
    public List<CommercialBudgetDTO> toDto(List<CommercialBudget> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CommercialBudgetDTO> list = new ArrayList<CommercialBudgetDTO>( entityList.size() );
        for ( CommercialBudget commercialBudget : entityList ) {
            list.add( toDto( commercialBudget ) );
        }

        return list;
    }
}
