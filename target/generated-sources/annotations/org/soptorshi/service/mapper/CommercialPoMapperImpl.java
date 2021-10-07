package org.soptorshi.service.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.soptorshi.domain.CommercialPi;
import org.soptorshi.domain.CommercialPo;
import org.soptorshi.service.dto.CommercialPoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2021-09-05T16:56:25+0600",
    comments = "version: 1.2.0.Final, compiler: javac, environment: Java 1.8.0_291 (Oracle Corporation)"
)
@Component
public class CommercialPoMapperImpl implements CommercialPoMapper {

    @Autowired
    private CommercialPiMapper commercialPiMapper;

    @Override
    public List<CommercialPo> toEntity(List<CommercialPoDTO> dtoList) {
        if ( dtoList == null ) {
            return null;
        }

        List<CommercialPo> list = new ArrayList<CommercialPo>( dtoList.size() );
        for ( CommercialPoDTO commercialPoDTO : dtoList ) {
            list.add( toEntity( commercialPoDTO ) );
        }

        return list;
    }

    @Override
    public List<CommercialPoDTO> toDto(List<CommercialPo> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<CommercialPoDTO> list = new ArrayList<CommercialPoDTO>( entityList.size() );
        for ( CommercialPo commercialPo : entityList ) {
            list.add( toDto( commercialPo ) );
        }

        return list;
    }

    @Override
    public CommercialPoDTO toDto(CommercialPo commercialPo) {
        if ( commercialPo == null ) {
            return null;
        }

        CommercialPoDTO commercialPoDTO = new CommercialPoDTO();

        Long id = commercialPoCommercialPiId( commercialPo );
        if ( id != null ) {
            commercialPoDTO.setCommercialPiId( id );
        }
        String proformaNo = commercialPoCommercialPiProformaNo( commercialPo );
        if ( proformaNo != null ) {
            commercialPoDTO.setCommercialPiProformaNo( proformaNo );
        }
        commercialPoDTO.setId( commercialPo.getId() );
        commercialPoDTO.setPurchaseOrderNo( commercialPo.getPurchaseOrderNo() );
        commercialPoDTO.setPurchaseOrderDate( commercialPo.getPurchaseOrderDate() );
        commercialPoDTO.setOriginOfGoods( commercialPo.getOriginOfGoods() );
        commercialPoDTO.setFinalDestination( commercialPo.getFinalDestination() );
        commercialPoDTO.setShipmentDate( commercialPo.getShipmentDate() );
        commercialPoDTO.setPoStatus( commercialPo.getPoStatus() );
        commercialPoDTO.setCreatedBy( commercialPo.getCreatedBy() );
        commercialPoDTO.setCreatedOn( commercialPo.getCreatedOn() );
        commercialPoDTO.setUpdatedBy( commercialPo.getUpdatedBy() );
        commercialPoDTO.setUpdatedOn( commercialPo.getUpdatedOn() );

        return commercialPoDTO;
    }

    @Override
    public CommercialPo toEntity(CommercialPoDTO commercialPoDTO) {
        if ( commercialPoDTO == null ) {
            return null;
        }

        CommercialPo commercialPo = new CommercialPo();

        commercialPo.setCommercialPi( commercialPiMapper.fromId( commercialPoDTO.getCommercialPiId() ) );
        commercialPo.setId( commercialPoDTO.getId() );
        commercialPo.setPurchaseOrderNo( commercialPoDTO.getPurchaseOrderNo() );
        commercialPo.setPurchaseOrderDate( commercialPoDTO.getPurchaseOrderDate() );
        commercialPo.setOriginOfGoods( commercialPoDTO.getOriginOfGoods() );
        commercialPo.setFinalDestination( commercialPoDTO.getFinalDestination() );
        commercialPo.setShipmentDate( commercialPoDTO.getShipmentDate() );
        commercialPo.setPoStatus( commercialPoDTO.getPoStatus() );
        commercialPo.setCreatedBy( commercialPoDTO.getCreatedBy() );
        commercialPo.setCreatedOn( commercialPoDTO.getCreatedOn() );
        commercialPo.setUpdatedBy( commercialPoDTO.getUpdatedBy() );
        commercialPo.setUpdatedOn( commercialPoDTO.getUpdatedOn() );

        return commercialPo;
    }

    private Long commercialPoCommercialPiId(CommercialPo commercialPo) {
        if ( commercialPo == null ) {
            return null;
        }
        CommercialPi commercialPi = commercialPo.getCommercialPi();
        if ( commercialPi == null ) {
            return null;
        }
        Long id = commercialPi.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String commercialPoCommercialPiProformaNo(CommercialPo commercialPo) {
        if ( commercialPo == null ) {
            return null;
        }
        CommercialPi commercialPi = commercialPo.getCommercialPi();
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
