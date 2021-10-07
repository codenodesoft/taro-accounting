package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.PurchaseOrder;
import org.soptorshi.domain.PurchaseOrderVoucherRelation;
import org.soptorshi.domain.Voucher;
import org.soptorshi.service.dto.PurchaseOrderVoucherRelationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:24+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class PurchaseOrderVoucherRelationMapperImpl implements PurchaseOrderVoucherRelationMapper {

    @Autowired
    private VoucherMapper voucherMapper;
    @Autowired
    private PurchaseOrderMapper purchaseOrderMapper;

    @Override
    public List<PurchaseOrderVoucherRelation> toEntity(List<PurchaseOrderVoucherRelationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<PurchaseOrderVoucherRelation> list = new ArrayList<PurchaseOrderVoucherRelation>( dtoList.size() );
        for ( PurchaseOrderVoucherRelationDTO purchaseOrderVoucherRelationDTO : dtoList ) {
            list.add( toEntity( purchaseOrderVoucherRelationDTO ) );
        }

        return list;
    }

    @Override
    public List<PurchaseOrderVoucherRelationDTO> toDto(List<PurchaseOrderVoucherRelation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<PurchaseOrderVoucherRelationDTO> list = new ArrayList<PurchaseOrderVoucherRelationDTO>( entityList.size() );
        for ( PurchaseOrderVoucherRelation purchaseOrderVoucherRelation : entityList ) {
            list.add( toDto( purchaseOrderVoucherRelation ) );
        }

        return list;
    }

    @Override
    public PurchaseOrderVoucherRelationDTO toDto(PurchaseOrderVoucherRelation purchaseOrderVoucherRelation) {
        if ( purchaseOrderVoucherRelation == null ) {
            return null;
        }

        PurchaseOrderVoucherRelationDTO purchaseOrderVoucherRelationDTO = new PurchaseOrderVoucherRelationDTO();

        String name = purchaseOrderVoucherRelationVoucherName( purchaseOrderVoucherRelation );
        if ( name != null ) {
            purchaseOrderVoucherRelationDTO.setVoucherName( name );
        }
        String purchaseOrderNo = purchaseOrderVoucherRelationPurchaseOrderPurchaseOrderNo( purchaseOrderVoucherRelation );
        if ( purchaseOrderNo != null ) {
            purchaseOrderVoucherRelationDTO.setPurchaseOrderPurchaseOrderNo( purchaseOrderNo );
        }
        Long id = purchaseOrderVoucherRelationVoucherId( purchaseOrderVoucherRelation );
        if ( id != null ) {
            purchaseOrderVoucherRelationDTO.setVoucherId( id );
        }
        Long id1 = purchaseOrderVoucherRelationPurchaseOrderId( purchaseOrderVoucherRelation );
        if ( id1 != null ) {
            purchaseOrderVoucherRelationDTO.setPurchaseOrderId( id1 );
        }
        purchaseOrderVoucherRelationDTO.setId( purchaseOrderVoucherRelation.getId() );
        purchaseOrderVoucherRelationDTO.setVoucherNo( purchaseOrderVoucherRelation.getVoucherNo() );
        purchaseOrderVoucherRelationDTO.setAmount( purchaseOrderVoucherRelation.getAmount() );
        purchaseOrderVoucherRelationDTO.setCreateBy( purchaseOrderVoucherRelation.getCreateBy() );
        purchaseOrderVoucherRelationDTO.setModifiedBy( purchaseOrderVoucherRelation.getModifiedBy() );
        purchaseOrderVoucherRelationDTO.setModifiedOn( purchaseOrderVoucherRelation.getModifiedOn() );

        return purchaseOrderVoucherRelationDTO;
    }

    @Override
    public PurchaseOrderVoucherRelation toEntity(PurchaseOrderVoucherRelationDTO purchaseOrderVoucherRelationDTO) {
        if ( purchaseOrderVoucherRelationDTO == null ) {
            return null;
        }

        PurchaseOrderVoucherRelation purchaseOrderVoucherRelation = new PurchaseOrderVoucherRelation();

        purchaseOrderVoucherRelation.setPurchaseOrder( purchaseOrderMapper.fromId( purchaseOrderVoucherRelationDTO.getPurchaseOrderId() ) );
        purchaseOrderVoucherRelation.setVoucher( voucherMapper.fromId( purchaseOrderVoucherRelationDTO.getVoucherId() ) );
        purchaseOrderVoucherRelation.setId( purchaseOrderVoucherRelationDTO.getId() );
        purchaseOrderVoucherRelation.setVoucherNo( purchaseOrderVoucherRelationDTO.getVoucherNo() );
        purchaseOrderVoucherRelation.setAmount( purchaseOrderVoucherRelationDTO.getAmount() );
        purchaseOrderVoucherRelation.setCreateBy( purchaseOrderVoucherRelationDTO.getCreateBy() );
        purchaseOrderVoucherRelation.setModifiedBy( purchaseOrderVoucherRelationDTO.getModifiedBy() );
        purchaseOrderVoucherRelation.setModifiedOn( purchaseOrderVoucherRelationDTO.getModifiedOn() );

        return purchaseOrderVoucherRelation;
    }

    private String purchaseOrderVoucherRelationVoucherName(PurchaseOrderVoucherRelation purchaseOrderVoucherRelation) {
        if ( purchaseOrderVoucherRelation == null ) {
            return null;
        }
        Voucher voucher = purchaseOrderVoucherRelation.getVoucher();
        if ( voucher == null ) {
            return null;
        }
        String name = voucher.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private String purchaseOrderVoucherRelationPurchaseOrderPurchaseOrderNo(PurchaseOrderVoucherRelation purchaseOrderVoucherRelation) {
        if ( purchaseOrderVoucherRelation == null ) {
            return null;
        }
        PurchaseOrder purchaseOrder = purchaseOrderVoucherRelation.getPurchaseOrder();
        if ( purchaseOrder == null ) {
            return null;
        }
        String purchaseOrderNo = purchaseOrder.getPurchaseOrderNo();
        if ( purchaseOrderNo == null ) {
            return null;
        }
        return purchaseOrderNo;
    }

    private Long purchaseOrderVoucherRelationVoucherId(PurchaseOrderVoucherRelation purchaseOrderVoucherRelation) {
        if ( purchaseOrderVoucherRelation == null ) {
            return null;
        }
        Voucher voucher = purchaseOrderVoucherRelation.getVoucher();
        if ( voucher == null ) {
            return null;
        }
        Long id = voucher.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Long purchaseOrderVoucherRelationPurchaseOrderId(PurchaseOrderVoucherRelation purchaseOrderVoucherRelation) {
        if ( purchaseOrderVoucherRelation == null ) {
            return null;
        }
        PurchaseOrder purchaseOrder = purchaseOrderVoucherRelation.getPurchaseOrder();
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
