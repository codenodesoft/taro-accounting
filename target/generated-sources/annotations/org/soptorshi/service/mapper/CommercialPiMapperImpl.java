package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.CommercialBudget;
import org.soptorshi.domain.CommercialPi;
import org.soptorshi.service.dto.CommercialPiDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:25+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class CommercialPiMapperImpl implements CommercialPiMapper {

    @Autowired
    private CommercialBudgetMapper commercialBudgetMapper;

    @Override
    public List<CommercialPi> toEntity(List<CommercialPiDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<CommercialPi> list = new ArrayList<CommercialPi>( dtoList.size() );
        for ( CommercialPiDTO commercialPiDTO : dtoList ) {
            list.add( toEntity( commercialPiDTO ) );
        }

        return list;
    }

    @Override
    public List<CommercialPiDTO> toDto(List<CommercialPi> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CommercialPiDTO> list = new ArrayList<CommercialPiDTO>( entityList.size() );
        for ( CommercialPi commercialPi : entityList ) {
            list.add( toDto( commercialPi ) );
        }

        return list;
    }

    @Override
    public CommercialPiDTO toDto(CommercialPi commercialPi) {
        if ( commercialPi == null ) {
            return null;
        }

        CommercialPiDTO commercialPiDTO = new CommercialPiDTO();

        String budgetNo = commercialPiCommercialBudgetBudgetNo( commercialPi );
        if ( budgetNo != null ) {
            commercialPiDTO.setCommercialBudgetBudgetNo( budgetNo );
        }
        Long id = commercialPiCommercialBudgetId( commercialPi );
        if ( id != null ) {
            commercialPiDTO.setCommercialBudgetId( id );
        }
        commercialPiDTO.setId( commercialPi.getId() );
        commercialPiDTO.setCompanyName( commercialPi.getCompanyName() );
        commercialPiDTO.setCompanyDescription( commercialPi.getCompanyDescription() );
        commercialPiDTO.setProformaNo( commercialPi.getProformaNo() );
        commercialPiDTO.setProformaDate( commercialPi.getProformaDate() );
        commercialPiDTO.setHarmonicCode( commercialPi.getHarmonicCode() );
        commercialPiDTO.setPaymentType( commercialPi.getPaymentType() );
        commercialPiDTO.setPaymentTerm( commercialPi.getPaymentTerm() );
        commercialPiDTO.setTermsOfDelivery( commercialPi.getTermsOfDelivery() );
        commercialPiDTO.setShipmentDate( commercialPi.getShipmentDate() );
        commercialPiDTO.setPortOfLoading( commercialPi.getPortOfLoading() );
        commercialPiDTO.setPortOfDestination( commercialPi.getPortOfDestination() );
        commercialPiDTO.setPurchaseOrderNo( commercialPi.getPurchaseOrderNo() );
        commercialPiDTO.setPiStatus( commercialPi.getPiStatus() );
        commercialPiDTO.setCreatedBy( commercialPi.getCreatedBy() );
        commercialPiDTO.setCreatedOn( commercialPi.getCreatedOn() );
        commercialPiDTO.setUpdatedBy( commercialPi.getUpdatedBy() );
        commercialPiDTO.setUpdatedOn( commercialPi.getUpdatedOn() );

        return commercialPiDTO;
    }

    @Override
    public CommercialPi toEntity(CommercialPiDTO commercialPiDTO) {
        if ( commercialPiDTO == null ) {
            return null;
        }

        CommercialPi commercialPi = new CommercialPi();

        commercialPi.setCommercialBudget( commercialBudgetMapper.fromId( commercialPiDTO.getCommercialBudgetId() ) );
        commercialPi.setId( commercialPiDTO.getId() );
        commercialPi.setCompanyName( commercialPiDTO.getCompanyName() );
        commercialPi.setCompanyDescription( commercialPiDTO.getCompanyDescription() );
        commercialPi.setProformaNo( commercialPiDTO.getProformaNo() );
        commercialPi.setProformaDate( commercialPiDTO.getProformaDate() );
        commercialPi.setHarmonicCode( commercialPiDTO.getHarmonicCode() );
        commercialPi.setPaymentType( commercialPiDTO.getPaymentType() );
        commercialPi.setPaymentTerm( commercialPiDTO.getPaymentTerm() );
        commercialPi.setTermsOfDelivery( commercialPiDTO.getTermsOfDelivery() );
        commercialPi.setShipmentDate( commercialPiDTO.getShipmentDate() );
        commercialPi.setPortOfLoading( commercialPiDTO.getPortOfLoading() );
        commercialPi.setPortOfDestination( commercialPiDTO.getPortOfDestination() );
        commercialPi.setPurchaseOrderNo( commercialPiDTO.getPurchaseOrderNo() );
        commercialPi.setPiStatus( commercialPiDTO.getPiStatus() );
        commercialPi.setCreatedBy( commercialPiDTO.getCreatedBy() );
        commercialPi.setCreatedOn( commercialPiDTO.getCreatedOn() );
        commercialPi.setUpdatedBy( commercialPiDTO.getUpdatedBy() );
        commercialPi.setUpdatedOn( commercialPiDTO.getUpdatedOn() );

        return commercialPi;
    }

    private String commercialPiCommercialBudgetBudgetNo(CommercialPi commercialPi) {
        if ( commercialPi == null ) {
            return null;
        }
        CommercialBudget commercialBudget = commercialPi.getCommercialBudget();
        if ( commercialBudget == null ) {
            return null;
        }
        String budgetNo = commercialBudget.getBudgetNo();
        if ( budgetNo == null ) {
            return null;
        }
        return budgetNo;
    }

    private Long commercialPiCommercialBudgetId(CommercialPi commercialPi) {
        if ( commercialPi == null ) {
            return null;
        }
        CommercialBudget commercialBudget = commercialPi.getCommercialBudget();
        if ( commercialBudget == null ) {
            return null;
        }
        Long id = commercialBudget.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
