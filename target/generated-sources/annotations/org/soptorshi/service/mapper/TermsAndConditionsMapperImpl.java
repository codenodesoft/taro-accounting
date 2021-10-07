package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.PurchaseOrder;
import org.soptorshi.domain.TermsAndConditions;
import org.soptorshi.service.dto.TermsAndConditionsDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:23+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class TermsAndConditionsMapperImpl implements TermsAndConditionsMapper {

    @Autowired
    private PurchaseOrderMapper purchaseOrderMapper;

    @Override
    public List<TermsAndConditions> toEntity(List<TermsAndConditionsDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<TermsAndConditions> list = new ArrayList<TermsAndConditions>( dtoList.size() );
        for ( TermsAndConditionsDTO termsAndConditionsDTO : dtoList ) {
            list.add( toEntity( termsAndConditionsDTO ) );
        }

        return list;
    }

    @Override
    public List<TermsAndConditionsDTO> toDto(List<TermsAndConditions> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<TermsAndConditionsDTO> list = new ArrayList<TermsAndConditionsDTO>( entityList.size() );
        for ( TermsAndConditions termsAndConditions : entityList ) {
            list.add( toDto( termsAndConditions ) );
        }

        return list;
    }

    @Override
    public TermsAndConditionsDTO toDto(TermsAndConditions termsAndConditions) {
        if ( termsAndConditions == null ) {
            return null;
        }

        TermsAndConditionsDTO termsAndConditionsDTO = new TermsAndConditionsDTO();

        String purchaseOrderNo = termsAndConditionsPurchaseOrderPurchaseOrderNo( termsAndConditions );
        if ( purchaseOrderNo != null ) {
            termsAndConditionsDTO.setPurchaseOrderPurchaseOrderNo( purchaseOrderNo );
        }
        Long id = termsAndConditionsPurchaseOrderId( termsAndConditions );
        if ( id != null ) {
            termsAndConditionsDTO.setPurchaseOrderId( id );
        }
        termsAndConditionsDTO.setId( termsAndConditions.getId() );
        termsAndConditionsDTO.setDescription( termsAndConditions.getDescription() );
        termsAndConditionsDTO.setModifiedBy( termsAndConditions.getModifiedBy() );
        termsAndConditionsDTO.setModifiedOn( termsAndConditions.getModifiedOn() );

        return termsAndConditionsDTO;
    }

    @Override
    public TermsAndConditions toEntity(TermsAndConditionsDTO termsAndConditionsDTO) {
        if ( termsAndConditionsDTO == null ) {
            return null;
        }

        TermsAndConditions termsAndConditions = new TermsAndConditions();

        termsAndConditions.setPurchaseOrder( purchaseOrderMapper.fromId( termsAndConditionsDTO.getPurchaseOrderId() ) );
        termsAndConditions.setId( termsAndConditionsDTO.getId() );
        termsAndConditions.setDescription( termsAndConditionsDTO.getDescription() );
        termsAndConditions.setModifiedBy( termsAndConditionsDTO.getModifiedBy() );
        termsAndConditions.setModifiedOn( termsAndConditionsDTO.getModifiedOn() );

        return termsAndConditions;
    }

    private String termsAndConditionsPurchaseOrderPurchaseOrderNo(TermsAndConditions termsAndConditions) {
        if ( termsAndConditions == null ) {
            return null;
        }
        PurchaseOrder purchaseOrder = termsAndConditions.getPurchaseOrder();
        if ( purchaseOrder == null ) {
            return null;
        }
        String purchaseOrderNo = purchaseOrder.getPurchaseOrderNo();
        if ( purchaseOrderNo == null ) {
            return null;
        }
        return purchaseOrderNo;
    }

    private Long termsAndConditionsPurchaseOrderId(TermsAndConditions termsAndConditions) {
        if ( termsAndConditions == null ) {
            return null;
        }
        PurchaseOrder purchaseOrder = termsAndConditions.getPurchaseOrder();
        if ( purchaseOrder == null ) {
            return null;
        }
        Long id = purchaseOrder.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }
}
