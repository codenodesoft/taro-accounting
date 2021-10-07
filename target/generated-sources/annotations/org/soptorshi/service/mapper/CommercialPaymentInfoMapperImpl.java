package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.CommercialPaymentInfo;
import org.soptorshi.domain.CommercialPi;
import org.soptorshi.service.dto.CommercialPaymentInfoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:25+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class CommercialPaymentInfoMapperImpl implements CommercialPaymentInfoMapper {

    @Autowired
    private CommercialPiMapper commercialPiMapper;

    @Override
    public List<CommercialPaymentInfo> toEntity(List<CommercialPaymentInfoDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<CommercialPaymentInfo> list = new ArrayList<CommercialPaymentInfo>( dtoList.size() );
        for ( CommercialPaymentInfoDTO commercialPaymentInfoDTO : dtoList ) {
            list.add( toEntity( commercialPaymentInfoDTO ) );
        }

        return list;
    }

    @Override
    public List<CommercialPaymentInfoDTO> toDto(List<CommercialPaymentInfo> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CommercialPaymentInfoDTO> list = new ArrayList<CommercialPaymentInfoDTO>( entityList.size() );
        for ( CommercialPaymentInfo commercialPaymentInfo : entityList ) {
            list.add( toDto( commercialPaymentInfo ) );
        }

        return list;
    }

    @Override
    public CommercialPaymentInfoDTO toDto(CommercialPaymentInfo commercialPaymentInfo) {
        if ( commercialPaymentInfo == null ) {
            return null;
        }

        CommercialPaymentInfoDTO commercialPaymentInfoDTO = new CommercialPaymentInfoDTO();

        Long id = commercialPaymentInfoCommercialPiId( commercialPaymentInfo );
        if ( id != null ) {
            commercialPaymentInfoDTO.setCommercialPiId( id );
        }
        String proformaNo = commercialPaymentInfoCommercialPiProformaNo( commercialPaymentInfo );
        if ( proformaNo != null ) {
            commercialPaymentInfoDTO.setCommercialPiProformaNo( proformaNo );
        }
        commercialPaymentInfoDTO.setId( commercialPaymentInfo.getId() );
        commercialPaymentInfoDTO.setPaymentType( commercialPaymentInfo.getPaymentType() );
        commercialPaymentInfoDTO.setTotalAmountToPay( commercialPaymentInfo.getTotalAmountToPay() );
        commercialPaymentInfoDTO.setTotalAmountPaid( commercialPaymentInfo.getTotalAmountPaid() );
        commercialPaymentInfoDTO.setRemainingAmountToPay( commercialPaymentInfo.getRemainingAmountToPay() );
        commercialPaymentInfoDTO.setPaymentStatus( commercialPaymentInfo.getPaymentStatus() );
        commercialPaymentInfoDTO.setCreatedOn( commercialPaymentInfo.getCreatedOn() );
        commercialPaymentInfoDTO.setCreatedBy( commercialPaymentInfo.getCreatedBy() );
        commercialPaymentInfoDTO.setUpdatedOn( commercialPaymentInfo.getUpdatedOn() );
        commercialPaymentInfoDTO.setUpdatedBy( commercialPaymentInfo.getUpdatedBy() );

        return commercialPaymentInfoDTO;
    }

    @Override
    public CommercialPaymentInfo toEntity(CommercialPaymentInfoDTO commercialPaymentInfoDTO) {
        if ( commercialPaymentInfoDTO == null ) {
            return null;
        }

        CommercialPaymentInfo commercialPaymentInfo = new CommercialPaymentInfo();

        commercialPaymentInfo.setCommercialPi( commercialPiMapper.fromId( commercialPaymentInfoDTO.getCommercialPiId() ) );
        commercialPaymentInfo.setId( commercialPaymentInfoDTO.getId() );
        commercialPaymentInfo.setPaymentType( commercialPaymentInfoDTO.getPaymentType() );
        commercialPaymentInfo.setTotalAmountToPay( commercialPaymentInfoDTO.getTotalAmountToPay() );
        commercialPaymentInfo.setTotalAmountPaid( commercialPaymentInfoDTO.getTotalAmountPaid() );
        commercialPaymentInfo.setRemainingAmountToPay( commercialPaymentInfoDTO.getRemainingAmountToPay() );
        commercialPaymentInfo.setPaymentStatus( commercialPaymentInfoDTO.getPaymentStatus() );
        commercialPaymentInfo.setCreatedOn( commercialPaymentInfoDTO.getCreatedOn() );
        commercialPaymentInfo.setCreatedBy( commercialPaymentInfoDTO.getCreatedBy() );
        commercialPaymentInfo.setUpdatedOn( commercialPaymentInfoDTO.getUpdatedOn() );
        commercialPaymentInfo.setUpdatedBy( commercialPaymentInfoDTO.getUpdatedBy() );

        return commercialPaymentInfo;
    }

    private Long commercialPaymentInfoCommercialPiId(CommercialPaymentInfo commercialPaymentInfo) {
        if ( commercialPaymentInfo == null ) {
            return null;
        }
        CommercialPi commercialPi = commercialPaymentInfo.getCommercialPi();
        if ( commercialPi == null ) {
            return null;
        }
        Long id = commercialPi.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String commercialPaymentInfoCommercialPiProformaNo(CommercialPaymentInfo commercialPaymentInfo) {
        if ( commercialPaymentInfo == null ) {
            return null;
        }
        CommercialPi commercialPi = commercialPaymentInfo.getCommercialPi();
        if ( commercialPi == null ) {
            return null;
        }
        String proformaNo = commercialPi.getProformaNo();
        if ( proformaNo == null ) {
            return null;
        }
        return proformaNo;
    }
}
