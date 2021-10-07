package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.PurchaseOrder;
import org.soptorshi.domain.Quotation;
import org.soptorshi.domain.Requisition;
import org.soptorshi.service.dto.PurchaseOrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class PurchaseOrderMapperImpl implements PurchaseOrderMapper {

    @Autowired
    private RequisitionMapper requisitionMapper;
    @Autowired
    private QuotationMapper quotationMapper;

    @Override
    public List<PurchaseOrder> toEntity(List<PurchaseOrderDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PurchaseOrder> list = new ArrayList<PurchaseOrder>( dtoList.size() );
        for ( PurchaseOrderDTO purchaseOrderDTO : dtoList ) {
            list.add( toEntity( purchaseOrderDTO ) );
        }

        return list;
    }

    @Override
    public List<PurchaseOrderDTO> toDto(List<PurchaseOrder> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PurchaseOrderDTO> list = new ArrayList<PurchaseOrderDTO>( entityList.size() );
        for ( PurchaseOrder purchaseOrder : entityList ) {
            list.add( toDto( purchaseOrder ) );
        }

        return list;
    }

    @Override
    public PurchaseOrderDTO toDto(PurchaseOrder purchaseOrder) {
        if ( purchaseOrder == null ) {
            return null;
        }

        PurchaseOrderDTO purchaseOrderDTO = new PurchaseOrderDTO();

        Long id = purchaseOrderRequisitionId( purchaseOrder );
        if ( id != null ) {
            purchaseOrderDTO.setRequisitionId( id );
        }
        String quotationNo = purchaseOrderQuotationQuotationNo( purchaseOrder );
        if ( quotationNo != null ) {
            purchaseOrderDTO.setQuotationQuotationNo( quotationNo );
        }
        Long id1 = purchaseOrderQuotationId( purchaseOrder );
        if ( id1 != null ) {
            purchaseOrderDTO.setQuotationId( id1 );
        }
        String requisitionNo = purchaseOrderRequisitionRequisitionNo( purchaseOrder );
        if ( requisitionNo != null ) {
            purchaseOrderDTO.setRequisitionRequisitionNo( requisitionNo );
        }
        purchaseOrderDTO.setId( purchaseOrder.getId() );
        purchaseOrderDTO.setPurchaseOrderNo( purchaseOrder.getPurchaseOrderNo() );
        purchaseOrderDTO.setWorkOrderNo( purchaseOrder.getWorkOrderNo() );
        purchaseOrderDTO.setIssueDate( purchaseOrder.getIssueDate() );
        purchaseOrderDTO.setReferredTo( purchaseOrder.getReferredTo() );
        purchaseOrderDTO.setSubject( purchaseOrder.getSubject() );
        purchaseOrderDTO.setNote( purchaseOrder.getNote() );
        purchaseOrderDTO.setLaborOrOtherAmount( purchaseOrder.getLaborOrOtherAmount() );
        purchaseOrderDTO.setDiscount( purchaseOrder.getDiscount() );
        purchaseOrderDTO.setStatus( purchaseOrder.getStatus() );
        purchaseOrderDTO.setModifiedBy( purchaseOrder.getModifiedBy() );
        purchaseOrderDTO.setModifiedOn( purchaseOrder.getModifiedOn() );

        return purchaseOrderDTO;
    }

    @Override
    public PurchaseOrder toEntity(PurchaseOrderDTO purchaseOrderDTO) {
        if ( purchaseOrderDTO == null ) {
            return null;
        }

        PurchaseOrder purchaseOrder = new PurchaseOrder();

        purchaseOrder.setRequisition( requisitionMapper.fromId( purchaseOrderDTO.getRequisitionId() ) );
        purchaseOrder.setQuotation( quotationMapper.fromId( purchaseOrderDTO.getQuotationId() ) );
        purchaseOrder.setId( purchaseOrderDTO.getId() );
        purchaseOrder.setPurchaseOrderNo( purchaseOrderDTO.getPurchaseOrderNo() );
        purchaseOrder.setWorkOrderNo( purchaseOrderDTO.getWorkOrderNo() );
        purchaseOrder.setIssueDate( purchaseOrderDTO.getIssueDate() );
        purchaseOrder.setReferredTo( purchaseOrderDTO.getReferredTo() );
        purchaseOrder.setSubject( purchaseOrderDTO.getSubject() );
        purchaseOrder.setNote( purchaseOrderDTO.getNote() );
        purchaseOrder.setLaborOrOtherAmount( purchaseOrderDTO.getLaborOrOtherAmount() );
        purchaseOrder.setDiscount( purchaseOrderDTO.getDiscount() );
        purchaseOrder.setStatus( purchaseOrderDTO.getStatus() );
        purchaseOrder.setModifiedBy( purchaseOrderDTO.getModifiedBy() );
        purchaseOrder.setModifiedOn( purchaseOrderDTO.getModifiedOn() );

        return purchaseOrder;
    }

    private Long purchaseOrderRequisitionId(PurchaseOrder purchaseOrder) {
        if ( purchaseOrder == null ) {
            return null;
        }
        Requisition requisition = purchaseOrder.getRequisition();
        if ( requisition == null ) {
            return null;
        }
        Long id = requisition.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String purchaseOrderQuotationQuotationNo(PurchaseOrder purchaseOrder) {
        if ( purchaseOrder == null ) {
            return null;
        }
        Quotation quotation = purchaseOrder.getQuotation();
        if ( quotation == null ) {
            return null;
        }
        String quotationNo = quotation.getQuotationNo();
        if ( quotationNo == null ) {
            return null;
        }
        return quotationNo;
    }

    private Long purchaseOrderQuotationId(PurchaseOrder purchaseOrder) {
        if ( purchaseOrder == null ) {
            return null;
        }
        Quotation quotation = purchaseOrder.getQuotation();
        if ( quotation == null ) {
            return null;
        }
        Long id = quotation.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String purchaseOrderRequisitionRequisitionNo(PurchaseOrder purchaseOrder) {
        if ( purchaseOrder == null ) {
            return null;
        }
        Requisition requisition = purchaseOrder.getRequisition();
        if ( requisition == null ) {
            return null;
        }
        String requisitionNo = requisition.getRequisitionNo();
        if ( requisitionNo == null ) {
            return null;
        }
        return requisitionNo;
    }
}
