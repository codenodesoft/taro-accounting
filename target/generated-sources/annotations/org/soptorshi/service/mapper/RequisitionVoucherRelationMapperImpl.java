package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.Requisition;
import org.soptorshi.domain.RequisitionVoucherRelation;
import org.soptorshi.domain.Voucher;
import org.soptorshi.service.dto.RequisitionVoucherRelationDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:25+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class RequisitionVoucherRelationMapperImpl implements RequisitionVoucherRelationMapper {

    @Autowired
    private VoucherMapper voucherMapper;
    @Autowired
    private RequisitionMapper requisitionMapper;

    @Override
    public List<RequisitionVoucherRelation> toEntity(List<RequisitionVoucherRelationDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<RequisitionVoucherRelation> list = new ArrayList<RequisitionVoucherRelation>( dtoList.size() );
        for ( RequisitionVoucherRelationDTO requisitionVoucherRelationDTO : dtoList ) {
            list.add( toEntity( requisitionVoucherRelationDTO ) );
        }

        return list;
    }

    @Override
    public List<RequisitionVoucherRelationDTO> toDto(List<RequisitionVoucherRelation> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<RequisitionVoucherRelationDTO> list = new ArrayList<RequisitionVoucherRelationDTO>( entityList.size() );
        for ( RequisitionVoucherRelation requisitionVoucherRelation : entityList ) {
            list.add( toDto( requisitionVoucherRelation ) );
        }

        return list;
    }

    @Override
    public RequisitionVoucherRelationDTO toDto(RequisitionVoucherRelation requisitionVoucherRelation) {
        if ( requisitionVoucherRelation == null ) {
            return null;
        }

        RequisitionVoucherRelationDTO requisitionVoucherRelationDTO = new RequisitionVoucherRelationDTO();

        Long id = requisitionVoucherRelationRequisitionId( requisitionVoucherRelation );
        if ( id != null ) {
            requisitionVoucherRelationDTO.setRequisitionId( id );
        }
        String name = requisitionVoucherRelationVoucherName( requisitionVoucherRelation );
        if ( name != null ) {
            requisitionVoucherRelationDTO.setVoucherName( name );
        }
        Long id1 = requisitionVoucherRelationVoucherId( requisitionVoucherRelation );
        if ( id1 != null ) {
            requisitionVoucherRelationDTO.setVoucherId( id1 );
        }
        String requisitionNo = requisitionVoucherRelationRequisitionRequisitionNo( requisitionVoucherRelation );
        if ( requisitionNo != null ) {
            requisitionVoucherRelationDTO.setRequisitionRequisitionNo( requisitionNo );
        }
        requisitionVoucherRelationDTO.setId( requisitionVoucherRelation.getId() );
        requisitionVoucherRelationDTO.setVoucherNo( requisitionVoucherRelation.getVoucherNo() );
        requisitionVoucherRelationDTO.setAmount( requisitionVoucherRelation.getAmount() );
        requisitionVoucherRelationDTO.setModifiedBy( requisitionVoucherRelation.getModifiedBy() );
        requisitionVoucherRelationDTO.setModifiedOn( requisitionVoucherRelation.getModifiedOn() );

        return requisitionVoucherRelationDTO;
    }

    @Override
    public RequisitionVoucherRelation toEntity(RequisitionVoucherRelationDTO requisitionVoucherRelationDTO) {
        if ( requisitionVoucherRelationDTO == null ) {
            return null;
        }

        RequisitionVoucherRelation requisitionVoucherRelation = new RequisitionVoucherRelation();

        requisitionVoucherRelation.setRequisition( requisitionMapper.fromId( requisitionVoucherRelationDTO.getRequisitionId() ) );
        requisitionVoucherRelation.setVoucher( voucherMapper.fromId( requisitionVoucherRelationDTO.getVoucherId() ) );
        requisitionVoucherRelation.setId( requisitionVoucherRelationDTO.getId() );
        requisitionVoucherRelation.setVoucherNo( requisitionVoucherRelationDTO.getVoucherNo() );
        requisitionVoucherRelation.setAmount( requisitionVoucherRelationDTO.getAmount() );
        requisitionVoucherRelation.setModifiedBy( requisitionVoucherRelationDTO.getModifiedBy() );
        requisitionVoucherRelation.setModifiedOn( requisitionVoucherRelationDTO.getModifiedOn() );

        return requisitionVoucherRelation;
    }

    private Long requisitionVoucherRelationRequisitionId(RequisitionVoucherRelation requisitionVoucherRelation) {
        if ( requisitionVoucherRelation == null ) {
            return null;
        }
        Requisition requisition = requisitionVoucherRelation.getRequisition();
        if ( requisition == null ) {
            return null;
        }
        Long id = requisition.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String requisitionVoucherRelationVoucherName(RequisitionVoucherRelation requisitionVoucherRelation) {
        if ( requisitionVoucherRelation == null ) {
            return null;
        }
        Voucher voucher = requisitionVoucherRelation.getVoucher();
        if ( voucher == null ) {
            return null;
        }
        String name = voucher.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Long requisitionVoucherRelationVoucherId(RequisitionVoucherRelation requisitionVoucherRelation) {
        if ( requisitionVoucherRelation == null ) {
            return null;
        }
        Voucher voucher = requisitionVoucherRelation.getVoucher();
        if ( voucher == null ) {
            return null;
        }
        Long id = voucher.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String requisitionVoucherRelationRequisitionRequisitionNo(RequisitionVoucherRelation requisitionVoucherRelation) {
        if ( requisitionVoucherRelation == null ) {
            return null;
        }
        Requisition requisition = requisitionVoucherRelation.getRequisition();
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
